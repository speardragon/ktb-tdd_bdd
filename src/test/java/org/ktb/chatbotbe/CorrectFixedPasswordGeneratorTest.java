package org.ktb.chatbotbe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorrectFixedPasswordGeneratorTest {
    @Test
    void testGeneratePassword() {
        // Given
        PasswordGenerator passwordGenerator = new CorrectFixedPasswordGenerator();

        // When
        String password = passwordGenerator.generatePassword();

        // Then
        assertNotNull(password, "Password should not be null");
        assertEquals(8, password.length(), "Password length should be 8 characters");
        assertEquals("12345678", password, "Password should be '12345678'");
    }
}