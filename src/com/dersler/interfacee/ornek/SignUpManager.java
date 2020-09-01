package com.dersler.interfacee.ornek;

public class SignUpManager {
    private UserCheckService userCheckService;

    public SignUpManager(UserCheckService userCheckService) {
        this.userCheckService = userCheckService;
    }

    public void signUp(User user) {
        if (userCheckService.checkUser(user)) {
            System.out.println("kayit basarili: " + user.toString());
        } else {
            System.out.println("kayit olamadi : " + user.toString());
        }
    }
}
