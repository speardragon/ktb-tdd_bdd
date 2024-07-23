package org.ktb.chatbotbe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrongFixedPasswordGeneratorTest {
    @Test
    void testGeneratePassword() {
        // Given
        PasswordGenerator passwordGenerator = new WrongFixedPasswordGenerator();

        // When
        String password = passwordGenerator.generatePassword();

        // Then
        assertNotNull(password, "Password should not be null");
        assertEquals(2, password.length(), "Password length should be 2 characters");
        assertEquals("12", password, "Password should be '12'");
    }

}