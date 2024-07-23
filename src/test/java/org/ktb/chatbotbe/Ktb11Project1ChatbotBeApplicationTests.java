package org.ktb.chatbotbe;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.ktb.chatbotbe.PasswordValidator.WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class Ktb11Project1ChatbotBeApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldNotInitializePasswordWhenGeneratedPasswordIsInvalid() {
        // Given
        Map<String, String> passwordMap = new HashMap<>();
        passwordMap.put("password", "12");
        HttpEntity<Map<String, String>> request = new HttpEntity<>(passwordMap, new HttpHeaders());

        // When
        ResponseEntity<String> response = restTemplate.exchange("/password/init", HttpMethod.POST, request, String.class);

        // Then
        assertThat(response.getBody()).isEqualTo("Password initialization failed");
    }

    @Test
    void shouldInitializePasswordWhenGeneratedPasswordIsValid() {
        // Given
        Map<String, String> passwordMap = new HashMap<>();
        passwordMap.put("password", "123456789");
        HttpEntity<Map<String, String>> request = new HttpEntity<>(passwordMap, new HttpHeaders());

        // When
        ResponseEntity<String> response = restTemplate.exchange("/password/init", HttpMethod.POST, request, String.class);

        // Then
        assertThat(response.getBody()).isEqualTo("Password initialized successfully");
    }
}
