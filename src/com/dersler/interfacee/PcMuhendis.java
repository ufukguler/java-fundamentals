package com.dersler.interfacee;

public class PcMuhendis implements IMuhendis {

    private boolean askerlik;
    private boolean sicilKaydi;

    public PcMuhendis(boolean askerlik, boolean sicilKaydi) {
        this.askerlik = askerlik;
        this.sicilKaydi = sicilKaydi;
    }

    @Override
    public String universite_adi(String uni) {
        return  "Universite: "+uni;

    }

    @Override
    public void adli_sicil() {
        if(sicilKaydi){
            System.out.println("sicil kaydı var");
        }else{
            System.out.println("sicil kaydı temiz");
        }
    }

    @Override
    public void askerlik() {
        if(askerlik){
            System.out.println("askerlik yapildi");
        }else{
            System.out.println("askerlik yapilmadi");
        }
    }

    @Override
    public void meslek(String meslek) {
        System.out.println("Meslek: "+meslek);
    }
}
