#!/bin/bash
source delegs.sh
grep -rh "[A-Z0-9_][A-Z0-9](new Symbol(" $DELEGS/* > ../data/sym/symlist.txt
