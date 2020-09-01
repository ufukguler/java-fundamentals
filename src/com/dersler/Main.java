package com.dersler;

import com.dersler.interfacee.IMuhendis;
import com.dersler.interfacee.MakineMuhendisi;
import com.dersler.interfacee.PcMuhendisi;

public class Main {

    public static void main(String[] args) {
        // IMuhendis muhendis1 = new IMuhendis();

        IMuhendis muhendis1 = new PcMuhendisi(false,false);

        /*muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.07));
        String[] tecrube = {"Vestel","Havelsan","Turksat"};

        muhendis1.is_tecrubesi(tecrube);*/

        MakineMuhendisi muhendis2 = new MakineMuhendisi(true,false);

        String[] tecrube = {};
        String[] referans = {"Mustafa Murat Coşkun","Serhat Say"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.31));
        muhendis2.is_tecrubesi(tecrube);
        muhendis2.referans_getir(referans);
        muhendis2.calis();

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
