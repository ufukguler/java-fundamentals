package com.dersler.collection;

import java.util.Map;
import java.util.TreeMap;

public class Mapler {
    public static void main(String[] args) {
        /*
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Java");
        hashMap.put(30, "React");
        hashMap.put(50, "Php");
        hashMap.put(20, "Java");
        // üzerine yazar 2 adet 20 olmaz.
        hashMap.put(50, "aa");
        //System.out.println(hashMap);

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
        Map<Integer, String> mapHashMap = new HashMap<>();
        Map<Integer, String> linkedhashmap = new LinkedHashMap<>();
        Map<Integer, String> treemap = new TreeMap<>();

        mapYazdir(mapHashMap);
        mapYazdir(linkedhashmap);
        mapYazdir(treemap);
        */

        frenkansBul("benim adım ufuk mesleğim bilgisayar mühendisliği");
    }

    public static void mapYazdir(Map<Integer, String> map) {
        map.put(10, "c++");
        map.put(5, "java");
        map.put(1, "pyhton");
        map.put(2, "php");
        map.put(100, "c");
        /*
        Collection<String> values = map.values();
        System.out.println(values);
        */
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }

        System.out.println("\n");
    }

    public static void frenkansBul(String cumle) {
        Map<Character, Integer> map = new TreeMap<>();
        for (Character c : cumle.toCharArray()) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                if (c != ' '){ // whitespace almasin
                    map.put(c, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
