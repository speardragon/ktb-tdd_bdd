package org.ktb.chatbotbe.domain.password;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PasswordControllerTest {

    @LocalServerPort
    private int port;

    @Mock
    private PasswordService passwordService;

    @InjectMocks
    private PasswordController passwordController;

    private TestRestTemplate restTemplate;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        restTemplate = new TestRestTemplate();
    }

    @Test
    public void testInitPassword_Success() {
        // Arrange
        String url = "http://localhost:" + port + "/password/init";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        HttpEntity<String> entity = new HttpEntity<>("{\"password\":\"12345678\"}", headers);

        when(passwordService.initPassword(anyString())).thenReturn(true);

        // Act
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

        // Assert
        assertThat(response.getBody()).isEqualTo("Password initialized successfully");
    }

    @Test
    public void testInitPassword_Failure() {
        // Arrange
        String url = "http://localhost:" + port + "/password/init";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        HttpEntity<String> entity = new HttpEntity<>("{\"password\":\"1234\"}", headers);

        when(passwordService.initPassword(anyString())).thenReturn(false);

        // Act
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

        // Assert
        assertThat(response.getBody()).isEqualTo("Password initialization failed");
    }
}
