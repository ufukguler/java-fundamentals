package com.dersler.interfacee.ornek;

public class AgeUserCheck implements UserCheckService {
    @Override
    public boolean checkUser(User user) {
        if (user.getAge() >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
