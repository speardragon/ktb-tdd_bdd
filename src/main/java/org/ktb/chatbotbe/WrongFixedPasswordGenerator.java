package org.ktb.chatbotbe;

public class WrongFixedPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        return "12";
    }
}
