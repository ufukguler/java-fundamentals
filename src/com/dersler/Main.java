package com.dersler;

import com.dersler.generic.GenericClass;
import com.dersler.innerClass.LocalInner;
import com.dersler.innerClass.Matematik;
import com.dersler.innerClass.Matematik.Factorial;
import com.dersler.interfacee.IMuhendis;
import com.dersler.interfacee.MakineMuhendisi;
import com.dersler.interfacee.PcMuhendisi;
import com.dersler.interfacee.ornek.AgeUserCheck;
import com.dersler.interfacee.ornek.ComplexUserCheck;
import com.dersler.interfacee.ornek.SignUpManager;
import com.dersler.interfacee.ornek.User;
import com.dersler.soyutAbstract.Daire;
import com.dersler.soyutAbstract.Kare;
import com.dersler.soyutAbstract.Sekil;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        GenericClass<String> genericClass = new GenericClass<String>();
        genericClass.yazdir(new String[]{"ali","veli","str"});
         */
        /*
        //Local inner class  burada ki local inner içeren metoda erişemeyiz.
        LocalInner localInner = new LocalInner("deneme");
        localInner.innerClassMethod();
         */

        /*  STATIK OLMAYAN INNER CLASS OBJESI
        Matematik.Factorial factorial = new Matematik().new Factorial();
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan alan = new Matematik().new Alan();
        Matematik.Alan.DaireAlan daire_alan = new Matematik().new Alan().new DaireAlan();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");

        int sayi = scanner.nextInt();
        if (asal.asal_mi(sayi)) {
            System.out.println("Bu sayı Asaldır.");
        }
        else {
            System.out.println("Bu sayı asal değildir..");
        }
        factorial.faktoriyel();
        //alan.daire_alan(5);
        daire_alan.daire_alan(6);
        */

        /*
        Kare kare = new Kare("kare", 3);
        kare.alanHesapla();
        kare.cevreHesapla();
        Daire daire = new Daire("daire", 3);
        daire.alanHesapla();
        Sekil kareSekli = new Kare("kare2",4);
        kareSekli.alanHesapla();
        // kare icinde tanimladigim cevre hesaplamayi goremez....
        */
         // sadece yas kontrolu
        SignUpManager signUpManager = new SignUpManager(new AgeUserCheck());
        signUpManager.signUp(new User(111,"Ufuk",17));
        signUpManager.signUp(new User(111,"Ufuk",18));
        System.out.println("\n");
        // yas + ismi U ile baslamali
        signUpManager = new SignUpManager(new ComplexUserCheck());
        signUpManager.signUp(new User(111,"Ufuk",17));
        signUpManager.signUp(new User(111,"İbo",18));
        signUpManager.signUp(new User(111,"Ufuk",18));

        /*
        IMuhendis muhendis1 = new IMuhendis();
        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.07));
        String[] tecrube = {"Vestel","Havelsan","Turksat"};
        muhendis1.is_tecrubesi(tecrube);
        */
        /*
        IMuhendis muhendis1 = new PcMuhendisi(false,false);
        MakineMuhendisi muhendis2 = new MakineMuhendisi(true,false);
        String[] tecrube = {};
        String[] referans = {"Mustafa Murat Coşkun","Serhat Say"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.31));
        muhendis2.is_tecrubesi(tecrube);
        muhendis2.referans_getir(referans);
        muhendis2.calis();
        */
        /*
        Araba arabam = new Araba();
        System.out.println(arabam.hashCode());
        arabam.renk = "sarı";
        Araba arabam1= arabam;
        System.out.println(arabam1.hashCode());
        System.out.println(arabam == arabam1);
        String a="sarı";
        Yonetici yonetici = new Yonetici("ufuk",10,"yazilim");
        System.out.println(yonetici.bilgileri());
        */
     }

}
