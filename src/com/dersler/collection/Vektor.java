package com.dersler.collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Vektor {
    public static void  main(String[] args) {
        Vector<String> stringVector = new Vector<>();
        stringVector.add("java");
        stringVector.add("php");
        stringVector.add("react");
        stringVector.add("python");
        stringVector.add("react");

        /*
        System.out.println(stringVector);
        System.out.println(stringVector.firstElement());
        System.out.println(stringVector.lastElement());

        ListIterator<String> iterator = stringVector.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Enumeration<String> stringEnumeration = stringVector.elements();
        while (stringEnumeration.hasMoreElements()){
            System.out.println(stringEnumeration.nextElement());
        }
        */
    }
}
