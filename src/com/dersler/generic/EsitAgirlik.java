package com.dersler.generic;

public class EsitAgirlik extends Aday {
    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik, String isim) {
        super(turkce, matematik, edebiyat, fizik, isim);
    }

    @Override
    public int puanHesapla() {
        return getEdebiyat() * 4 + getFizik() * 1 + getMatematik() * 5 + getTurkce() * 5;
    }
}
