package org.ktb.chatbotbe;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;
import static org.ktb.chatbotbe.PasswordValidator.WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE;

class PasswordValidatorTest {
    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하이면 예외가 발생하지 않는다.")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("12345678"))
                .doesNotThrowAnyException();
    }

    @DisplayName("비밀번호가 8자 미만 또는 12자를 초과하는 경우 IllegalArgumentException 예외가 발생한다.")
    @Test
    void validatePasswordExceptionTest() {
        assertThatCode(() -> PasswordValidator.validate("1234567"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
    }

    @DisplayName("경계에 있는 길이 값에 대해 IllegalArgumentException 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"1234567", "1234567890123"})
    void validatePasswordExceptionTest2(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
    }

}