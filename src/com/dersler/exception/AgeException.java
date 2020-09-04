package com.dersler.exception;

public class AgeException extends ArithmeticException {
    public AgeException(String s) {
        super(s);
    }

    @Override
    public void printStackTrace() {
        System.out.println("age error");
    }
}
