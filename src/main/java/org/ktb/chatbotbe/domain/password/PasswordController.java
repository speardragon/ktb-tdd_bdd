package org.ktb.chatbotbe.domain.password;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


// PasswordController.java

@RestController
@RequestMapping("/password")
public class PasswordController {

    private final PasswordService passwordService;
    private static final String PASSWORD_NOT_INITIALIZED_RESPONSE = "Password initialization failed";
    private static final String PASSWORD_INITIALIZED_RESPONSE = "Password initialized successfully";

    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @PostMapping("/init")
    public String initPassword(@RequestBody Map<String, String> map) {

        String password = map.get("password");
        System.out.println(password);
        boolean isPasswordInitialized = passwordService.initPassword(password);
        if (isPasswordInitialized) {
            return PASSWORD_INITIALIZED_RESPONSE;
        } else {
            return PASSWORD_NOT_INITIALIZED_RESPONSE;
        }
    }
}


