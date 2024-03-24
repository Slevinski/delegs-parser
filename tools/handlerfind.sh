#!/bin/bash
source delegs.sh

rm ../data/handlers/* 2>/dev/null

while IFS= read -r handler; do
    touch ../data/handlers/$handler.txt
    grep "public void $handler()" $DELEGS/src/de/signWritingEditor/shared/model/material/* | grep -v 'PositionedSymbol.java' | awk -F/ '{print $NF}' | awk -F: '{print $1}' > ../data/handlers/$handler.txt
done < ../data/handlers.txt

find ../data/handlers -type f -empty -delete
