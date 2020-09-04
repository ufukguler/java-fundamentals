package com.dersler.collection;

import java.util.*;

public class Sets {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();

        set1.add("Java");
        set1.add("Python");
        set1.add("React");
        set1.add("C++");
        set2.add("Java");
        set2.add("Python");
        set2.add("React");
        set2.add("C++");
        set3.add("Java");
        set3.add("Python");
        set3.add("React");
        set3.add("C++");

        for (String s : set1) {
            System.out.println(s);
        }
        System.out.println("*****************");
        for (String s : set2) {
            System.out.println(s);
        }
        System.out.println("*****************");
        for (String s : set3) {
            System.out.println(s);
        }
        Set<String> set4 = new HashSet<>();
        set4.add("Go");
        set4.add("Vue");
        set4.add("Java");

        Set<String> setFark = new HashSet<>(set2);
        setFark.removeAll(set4);  // fark icinden set4 ü tamamen sil
        System.out.println("***************\nfarkseti\n" + setFark);

        Set<String> kesisim = new HashSet<>(set3);
        System.out.println("kesisim:" + kesisim + "  set3:" + set3);
        kesisim.retainAll(set4); // ortaklari bul
        System.out.println(kesisim);

    }
}
