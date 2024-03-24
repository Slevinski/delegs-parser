#!/bin/bash
source delegs.sh
grep -P "\t+specificPositionedSymbol" $DELEGS/src/de/signWritingEditor/client/GWTClient/ui/tool/subtools/signEditor/SignEditor.java | grep -oP '\.\K[^.(]+(?=\()' | sort | uniq > ../data/handlers.txt
