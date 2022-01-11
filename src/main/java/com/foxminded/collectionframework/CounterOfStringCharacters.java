package com.foxminded.collectionframework;

import java.util.HashMap;

public class CounterOfStringCharacters {

    private static HashMap<String, HashMap<Character, Integer>> cachedValues = new HashMap();

    public HashMap<Character, Integer> characterCount(String inputString) {

        if (cachedValues.containsKey(inputString)) {
            return cachedValues.get(inputString);
        }

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        cachedValues.put(inputString, charCountMap);
        return charCountMap;
    }
}