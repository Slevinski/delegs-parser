#!/bin/bash

# The path to the handlers directory and the symid.csv
handlers_dir="../data/handlers"
symid_file="../data/sym/symid.csv"
symkey_file="../data/sym/symkey.csv"

# Read the CSV file and store the patterns and replacements in an associative array
declare -A replacements
while IFS=, read -r value key; do
    replacements["$key"]=$value
done < "$symid_file"

# Read the CSV file and store the patterns and replacements in an associative array
declare -A replacements2
while IFS=, read -r value key; do
    replacements2["$value"]=$key
done < "$symkey_file"

# Function to escape strings for use in sed
escape_for_sed() {
    echo $1 | sed -e 's/[]\/$*.^[]/\\&/g'
}

# Export the function so that it is available in subshells
export -f escape_for_sed

# Process the .java files
find "$handlers_dir" -type f -name "*.java" | while read -r java_file; do
    # Make a .txt filename based on the .java filename
    txt_file="${java_file%.java}.txt"

    # Copy the contents of the .java file to the .txt file
    cp "$java_file" "$txt_file"

    # Perform the replacements, considering patterns enclosed in dots
    for key in "${!replacements[@]}"; do
        escaped_key=$(escape_for_sed "$key")
        # escaped_replacement=$(escape_for_sed "${replacements[$key]}")
        escaped_replacement=$(escape_for_sed "${replacements2[${replacements[$key]}]}")

        # Use & in the replacement to refer to the entire match from the pattern
        sed -i -E "s/(\\.)$escaped_key(\\.)/\1$escaped_replacement\2/g" "$txt_file"
    done
done

echo "Replacement process completed."