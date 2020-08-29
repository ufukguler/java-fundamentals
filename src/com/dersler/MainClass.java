package com.dersler;

import com.dersler.oop.accessModifiers.Araba;
import com.dersler.oop.inheritance.Yonetici;

public class MainClass {

    public static void main(String[] args) {
        Araba arabam = new Araba();
        System.out.println(arabam.hashCode());
        arabam.renk = "sarı";
        Araba arabam1= arabam;
        System.out.println(arabam1.hashCode());
        System.out.println(arabam == arabam1);
        String a="sarı";

        Yonetici yonetici = new Yonetici("ufuk",10,"yazilim");
        System.out.println(yonetici.bilgileri());

     }

}
