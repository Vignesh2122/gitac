package com.example;

public class Test {
    public static void main(String[] args) {
        // Introducing a bug: NullPointerException
        String test = null;
        System.out.println(test.length());  // This will throw a NullPointerException
    }
}

