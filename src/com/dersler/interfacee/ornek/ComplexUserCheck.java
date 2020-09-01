package com.dersler.interfacee.ornek;

public class ComplexUserCheck implements UserCheckService {
    @Override
    public boolean checkUser(User user) {
        if (user.getAge() >= 18 && user.getName().startsWith("U")) {
            return true;
        } else {
            return false;
        }
    }
}
