package org.ktb.chatbotbe.domain.password;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordServiceTest {

    @Test
    public void testInitPassword() {
        // Arrange
        PasswordService passwordService = new PasswordService();
        String testPassword = "testPassword";

        // Act
        boolean result = passwordService.initPassword(testPassword);

        // Assert
        assertThat(result).isTrue();
    }
}
