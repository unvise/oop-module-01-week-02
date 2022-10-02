package com.unvise.oop.task1.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadmintonPlayResolverTest {

    @Test
    void resolve() {
        // given
        boolean ex1 = BadmintonPlayResolver.resolve(
                "воскресенье",
                "тепло",
                "ясно",
                "низкая",
                "нет"
        );
        boolean ex2 = BadmintonPlayResolver.resolve(
                "воскресенье",
                "жарко",
                "ясно",
                "высокая",
                "нет"
        );
        // then
        assertAll(
                () -> assertTrue(ex1),
                () -> assertFalse(ex2)
        );
    }
}