package com.foxminded.collectionframework;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CounterOfStringCharactersTest {
    CounterOfStringCharacters counterOfStringCharacters = new CounterOfStringCharacters();
    @Test
    void testWhenGivenWord(){
        HashMap<Character, Integer> forTest = new HashMap<>();
        forTest.put('a',2);
        forTest.put('n',2);
        assertEquals(forTest,counterOfStringCharacters.characterCount("anna"));
    }
    @Test
    void testWhenGivenPhrase(){
        HashMap<Character, Integer> forTest = new HashMap<>();
        forTest.put(' ',1);forTest.put('!',2);forTest.put('r',1);forTest.put('d',1);forTest.put('e',1);forTest.put('w',1);forTest.put('H',1);
        forTest.put('l',3);forTest.put('o',2);
        assertEquals(forTest,counterOfStringCharacters.characterCount("Hello world!!"));
    }
}