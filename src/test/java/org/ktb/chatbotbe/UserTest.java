package org.ktb.chatbotbe;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {
    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest() {
        // given: 이런 User 객체가 주어졌고,
        User user = new User();

        // when: 이 메소드를 호출했을 때,
        user.initPassword(new CorrectFixedPasswordGenerator());

        // then: 이런 경우를 기대한다.
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test
    void wrongPasswordTest() {
        // given: 이런 User 객체가 주어졌고,
        User user = new User();

        // when: 이 메소드를 호출했을 때,
        user.initPassword(new WrongFixedPasswordGenerator());

        // then: 이런 경우를 기대한다.
        assertThat(user.getPassword()).isNull();
    }
}