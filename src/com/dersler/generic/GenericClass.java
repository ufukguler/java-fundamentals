package com.dersler.generic;

public class GenericClass<E> {

    public void yazdir(E[] array){
        for (E e : array) {
            System.out.println(e);
        }
    }
}
