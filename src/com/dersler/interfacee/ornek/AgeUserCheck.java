package com.dersler.interfacee.ornek;

public class AgeUserCheck implements UserCheckService{
    @Override
    public void checkUser(User user) {
        if(user.getAge() >= 18){
            System.out.println("kayit olundu: "+user.getName());
        }else{
            System.out.println("kayit olamaz.");
        }
    }
}
