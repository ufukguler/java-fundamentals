package com.dersler.oop.inheritance;

public class Calisan { // SuperClass | BaseClass
    private String isim;
    private int maas;
    private String departman;

    public Calisan(String isim, int maas, String departman){
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public void calis(){
        System.out.println("calisan calisiyor..");
    }

    public String bilgileri() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", departman='" + departman + '\'' +
                '}';
    }
}
