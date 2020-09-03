package com.dersler.generic;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Sayisal sayisal1 = new Sayisal(25, 45, 23, 45, "ogr1");
        Sayisal sayisal2 = new Sayisal(45, 35, 22, 10, "ogr2");
        Sayisal sayisal3 = new Sayisal(35, 25, 21, 25, "ogr3");
        Sayisal sayisal5 = new Sayisal(35, 25, 21, 27, "ogr5");
        Sayisal sayisal7 = new Sayisal(35, 25, 21, 29, "ogr7");

        EsitAgirlik esitAgirlik = new EsitAgirlik(35, 25, 21, 28, "ogr6");
        EsitAgirlik esitAgirlik1 = new EsitAgirlik(35, 25, 21, 26, "ogr4");

        Aday birinci = birinci(sayisal1, sayisal2, sayisal3, sayisal5, sayisal7, esitAgirlik, esitAgirlik1);
        System.out.printf("birinci: " + birinci.getIsim() + " puan:" + birinci.puanHesapla());
    }

    public static <E extends Aday> E birinci(E... s) {
        HashMap<E, Integer> arr = new HashMap();
        for (E ogrenci : s) {
            arr.put(ogrenci, ogrenci.puanHesapla());
        }
        E birinci = arr.entrySet().stream().max((eIntegerEntry, t1) -> eIntegerEntry.getValue() > t1.getValue() ? 1 : -1).get().getKey();
        return birinci;
    }
}  