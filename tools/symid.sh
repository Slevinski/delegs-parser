#!/bin/bash
awk -F',' '!/999/ {printf "%d%02d%02d%d,%s\n", $2, $3, $4, $5, $1}' ../data/sym/symdata.csv | sort > ../data/sym/symid.csv

