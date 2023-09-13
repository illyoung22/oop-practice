package org.example.FoodOrder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class CookTest {
    @Test
    @DisplayName("요리를 생성")
    void createTest() {
        assertThatCode(() -> new Cook("만두", 5000))
                .doesNotThrowAnyException();

    }
}
