package com.dersler.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        // buyukten kucuge siralama
        return -s1.compareTo(s2);
    }

    public static void main(String[] args){
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("Css");
        stringList.add("React");
        System.out.println(stringList);
        Collections.sort(stringList,new ComparatorTest());
        System.out.println("\n"+stringList);
    }
}
