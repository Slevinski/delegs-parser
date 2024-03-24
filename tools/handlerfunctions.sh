#!/bin/bash
source delegs.sh

DATA_DIR="../data/handlers"

# List all .txt files in the ../data directory
for txt_file in $DATA_DIR/*.txt; do
    # Extract function name from the txt filename
    function_name=$(basename $txt_file .txt)
    
    # Create a directory with the function name
    mkdir -p $DATA_DIR/$function_name
    
    # Process each filename in the txt file
    while IFS= read -r java_file; do
        FILE_PATH="$DELEGS/src/de/signWritingEditor/shared/model/material/$java_file"
        
        # Check if the Java file exists
        if [[ ! -f $FILE_PATH ]]; then
            echo "Warning: $java_file not found!"
            continue
        fi

        # Find the starting line of the function
        start_line=$(grep -n "public void $function_name(" $FILE_PATH | cut -d: -f1)

        # If the function is not found, skip to next file
        if [ -z "$start_line" ]; then
            echo "Function $function_name not found in $java_file!"
            continue
        fi

        # Calculate the ending line using brace counting
        end_line=$(awk -v start=$start_line '
        {
            if(NR < start) {
                next
            }
            if(capture == 0 && NR == start) {
                capture = 1
            }
            if(capture) {
                for(i=1; i<=length($0); i++) {
                    char = substr($0, i, 1)
                    if(char == "{") {
                        stack++
                    } else if(char == "}") {
                        stack--
                    }
                }
                if(stack == 0) {
                    print NR
                    exit
                }
            }
        }
        ' $FILE_PATH)

        # Extract the function using sed and write to the output file
        sed -n "$start_line,${end_line}p" $FILE_PATH > $DATA_DIR/$function_name/$java_file

    done < "$txt_file"

done
