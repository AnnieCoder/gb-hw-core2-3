package ru.gb.java_core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (phoneBook.get(name) == null){
            phoneBook.put(name, new ArrayList<>());
            phoneBook.get(name).add(phoneNumber);
        } else{
            phoneBook.get(name).add(phoneNumber);
        }
    }

    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }
}
