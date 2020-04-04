package org.example;


import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Map<String, Double> testMap = new HashMap<>();

        long count = testMap.values().stream().count();

        System.out.println(count);
    }
}