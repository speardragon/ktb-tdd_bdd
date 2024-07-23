package org.ktb.chatbotbe;

public class CorrectFixedPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        return "12345678"; // 8자 패스워드
    }
}
