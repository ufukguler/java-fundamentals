package com.dersler;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // byte --> short --> int -->  long
        byte a = Byte.MAX_VALUE; // 1 byte
        byte b = Byte.MIN_VALUE;
        short c = Short.MAX_VALUE; // 2byte
        int e = Integer.MAX_VALUE; // 4 byte
        long g = Long.MAX_VALUE; // 8 byte
        double i = Double.MAX_VALUE; // 8 byte
        float f = 5.1f;
        double dd = 22d / 7d;
        dd = 22 / 7;
        float ff = 22f / 7f;
        ff = 22 / 7;

        double d1 = 3.23d;
        double d2 = 3.2d;
        double d3 = 3d;
        System.out.println((d1+d2+d3)/3);
        // double ile daha doğru sonuçlar üretilir.
        float a1 = 3.23f;
        float a2 = 3.2f;
        float a3 = 3f;
        System.out.println((a1+a2+a3)/3);

    }
}
