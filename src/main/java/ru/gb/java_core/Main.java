package ru.gb.java_core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("toy");
        words.add("boy");
        words.add("joy");
        words.add("ice");
        words.add("whale");
        words.add("room");
        words.add("moon");
        words.add("palm");
        words.add("rice");
        words.add("spring");
        words.add("toy");
        words.add("boy");
        words.add("joy");
        words.add("ice");
        words.add("whale");
        words.add("room");
        words.add("moon");
        words.add("palm");
        words.add("spring");
        words.add("spring");

        // список уникальных слов
        Set<String> uniqueWords = new HashSet<String>(words);
        System.out.println("Unique words count: " + uniqueWords.size());

        // сколько раз встречается каждое слово
        for (String word : uniqueWords) {
            System.out.println("element: " + word + ", count: " + Collections.frequency(words, word));
        }

        // телефонный справочник
        PhoneBook book = new PhoneBook();
        book.add("Ivanov", "89261000101");
        book.add("Petrov", "89261000102");
        book.add("Sidorov", "89261000103");

        book.add("Petrov", "89261000107");

    }
}
