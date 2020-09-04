package com.dersler.exception;

public class Test {

    public static void main(String[] args) {
        int yas = 19;
        try {
            ageCheck(10);
        }catch (AgeException a){
            a.printStackTrace();
        }

    }
    static void ageCheck(int yas){
        if (yas >= 18) {
            System.out.println("hosgeldiniz");
        } else {
            throw new AgeException("Invalid Age");
        }
    }
}
