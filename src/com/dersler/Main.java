package com.dersler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //tipler();
        //operatorler();
        //scannerInput();
        //karsilastirma();
        //mantiksal();
        switchcase(5);
    }

    static void switchcase(int i){
        switch (i){
            case 1:
                System.out.println(i*6);
                break;
            case 2:
                System.out.println(i*3);
                break;
            case 3:
                System.out.println(i*2);
                break;
            default:
                System.out.println(i);
                break;
        }
    }

    static void mantiksal(){
        System.out.println(3==3 && 3==4);  //false
        System.out.println(3==3 & 4==4 & 5==4);  //false
        System.out.println(3==3 || 3==4);  //true
        System.out.println(3==3 | 3==4); //
        System.out.println(!false);
    }

    static void karsilastirma() {
        System.out.println(3==3);   //true
        System.out.println(3=='3'); //false

        String s1 = "c";
        String s2 = "c";
        System.out.println(s1.equals('c')); //false
        System.out.println(s1.equals("c")); //true
        System.out.println(s1 == s2); //true
        System.out.println(s1.equals(s2)); //true
    }

    static void scannerInput() {
        // nextint-double falan aldıktan sonra string almak istersek bi satır dummy almak gerekiliyor. yoksa geciyor string alma kısmını
        Scanner sc = new Scanner(System.in);
        System.out.print("yas girin:");
        if (sc.hasNextInt()) {
            int yas = sc.nextInt();
            System.out.println(" yas:" + yas);
        } else {
            System.out.println("bu sayi mi guzel kardesim? ...");
        }
        int yas = sc.nextInt();
        int yas1 = sc.nextInt();
        int yas2 = sc.nextInt();
        // burada girdiyi soyle yapabilirsi :>  5 25 3
        // bu boslukları tek tek anlıyor ve tek tek atıyor.

    }

    static void operatorler() {
        System.out.println("topla: " + 3 + 2.34 + "\nçıkart: " + (3f - 2.34d));
        System.out.println("çarp: " + 10d / 2.3f + "\nböl: " + 2.3 * 0.2f);
        System.out.println("kalan: " + (10 % 3));
        int a = 4;
        // soldan saga dogru islendiği için artırılmadan önceki halini aliyor
        System.out.println("a: " + a);
        int b = a++;
        System.out.println("a: " + a + " b:" + b);
        // soldan saga dogru islendiği için artırıldıktan sonraki halini aliyor
        int c = ++a;
        System.out.println("a: " + a + " c:" + c);
        int d = 5;
        d += 5;
        System.out.println("a:" + a + " b:" + b + " c:" + c + " d:" + d);
        System.out.println("a:" + a + " a++:" + a++ + " ++a:" + ++a);

        /*
            işlem öncelikleri
         */
        // islem onceligini yapabiliyor ama parantez ile yapmak daha doğru
        System.out.println(5 / 2 + 2 * 2);
        System.out.println((5 / 2) + (2 * 2));

    }

    static void tipler() {
        /*
         *          primitive tipler
         * byte,short,int,long,double,float,char,boolean
         *
         */
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
        System.out.println((d1 + d2 + d3) / 3);
        // double ile daha doğru sonuçlar üretilir.
        float a1 = 3.23f;
        float a2 = 3.2f;
        float a3 = 3f;
        System.out.println((a1 + a2 + a3) / 3);

        char ac = 'a';
        char bc = '2';
        char cc = 103; // g harfi
        char unicode = '\u0152';  // unicode karşılığını verelebiliriz.
        System.out.println(ac + " " + bc + " " + cc + " " + unicode + " " + '\u063c');
        /*
         * non-primitive tipler
         *
         */
        String s1 = "java";
        String s2 = " developer ";
        int i1 = 25;
        System.out.println(s1 + s2 + i1);
        System.out.println("?".equals('?'));


    }
}
