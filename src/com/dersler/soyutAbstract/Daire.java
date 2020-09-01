package com.dersler.soyutAbstract;

public class Daire extends Sekil {
    private int yaricap;

    public Daire(String isim, int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    public void alanHesapla() {
        System.out.println(this.getIsim() + " " + getIsim() + " alanı: " + (Math.PI * Math.pow(yaricap, 2)));
    }

}
