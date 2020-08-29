package com.dersler.oop.inheritance;

public class Yonetici extends Calisan{ // subClass

    public Yonetici(String isim, int maas, String departman) {
        super(isim, maas, departman);
    }

    @Override
    public String bilgileri() {
        return "yonetici bilgisi gizlidir... ama sana gostereyim  "+super.bilgileri();

    }
}
