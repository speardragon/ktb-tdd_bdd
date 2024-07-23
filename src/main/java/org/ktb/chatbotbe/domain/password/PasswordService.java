package org.ktb.chatbotbe.domain.password;

import org.ktb.chatbotbe.PasswordGenerator;
import org.ktb.chatbotbe.User;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {

    public boolean initPassword(String password) {
//        user.initPassword(passwordGenerator);
        User user = new User();
        user.initPassword(password);
        System.out.println(user.getPassword());
        return user.getPassword() != null;
    }
}