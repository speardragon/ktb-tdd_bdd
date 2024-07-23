package org.ktb.chatbotbe;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String password;

    public void initPassword(String password) {
//        String password = passwordGenerator.generatePassword();
//        System.out.println(password);
        if(password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public void initPassword(PasswordGenerator passwordGenerator) {
        String password = passwordGenerator.generatePassword();
        this.initPassword(password);
    }
}
