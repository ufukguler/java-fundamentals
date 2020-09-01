package com.dersler.interfacee.ornek;

public class ComplexUserCheck implements UserCheckService{
    @Override
    public void checkUser(User user) {
        if(user.getAge() >= 18 && user.getName().startsWith("U")){
            System.out.println("kayit olundu: "+user.getName());
        }else{
            System.out.println("kayit olamaz.");
        }
    }
}
