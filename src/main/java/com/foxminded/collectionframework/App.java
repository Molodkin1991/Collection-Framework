package com.foxminded.collectionframework;

public class App {
    public static void main(String[] args) {
        CounterOfStringCharacters some = new CounterOfStringCharacters();
        PrintingClass printingClass = new PrintingClass();
        printingClass.printTheStringWithCounter(some.characterCount("Mariya"));
    }

}