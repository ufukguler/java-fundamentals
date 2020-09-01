package com.dersler.soyutAbstract;

public class Kare extends Sekil {
    private int kenar;

    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    public void alanHesapla() {
        System.out.println(getIsim() + " alanı: " + Math.pow(kenar, 2));
    }

    public void cevreHesapla() {
        System.out.println(this.getIsim() + " çevresi: " + kenar * 4);
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }
}
