package com.foxminded.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class PrintingClass {
    public void printTheStringWithCounter(HashMap<Character, Integer> charCountMap) {

        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
