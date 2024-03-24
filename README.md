# Delegs Parser Tools
These tools analyze the [Delegs Editor](https://github.com/delegs/Delegs-Editor) source to uncover the symbol transformations used.

## Data

### Sym data

* `symlist.txt` - lines of code with symbol definitions
* `symdata.csv` - map of text name to symbol id parts
* `symid.csv` - map of short symbol id to text name
* `symkey.csv` - map of short symbol id to symbol key (created using @sutton-signwriting/core)

### Handler data

* `handlers.txt` - a list of symbol transformation handlers.
* `handlers` - a directory where each handler has a text file that lists the delegs source files involved and a directory with code excerpts.

## Tools

### Common scripts

* `delegs.sh` - defines link to delegs editor source code

### Symbol scripts

* `symlist.sh` - creates the data/sym/symlist.txt file
* `symdata.sh` - creates the data/sym/symdata.csv file
* `symid.sh` - creates the data/symid.csv file

### Handler scripts

* `handlerlist.sh` - finds symbol handlers and creates the data/handlers.txt file
* `handlerfind.sh` - finds files that use each symbol handler and creates multiple data/handlers/*handler*.txt files
* `handlerfunctions.sh` - finds the functions that use each symbol handler, extracts the function code, and creates multiple data/handlers/*handler*/*file.java* files
* `handlerRewrite.sh` - rewrites the extracted java files to replace the text names with the symbol keys

## ToDo

* grep "new Symbol" in code extract and replace function call with symbol key