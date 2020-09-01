package com.dersler.innerClass;

public class LocalInner {
    private String str;

    public LocalInner(String str) {
        this.str = str;
    }

    public void innerClassMethod() {
        class Alan {
            public void daire_alan(int yaricap) {
                System.out.println("(local inner) Dairenin Alanı: " + (yaricap * yaricap * Math.PI));
            }
        }
        Alan alan = new Alan();
        Alan alan2 = new Alan();

        alan.daire_alan(10);
        alan2.daire_alan(3);
    }
}
