#!/bin/bash
awk -F'[(,]' '{print $1 "," $3 "," $4 "," $5 "," $6}' ../data/sym/symlist.txt | tr -d ' \t' > ../data/sym/symdata.csv
