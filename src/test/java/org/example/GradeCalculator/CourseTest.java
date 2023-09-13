package org.example.GradeCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CourseTest
{
    @Test
    @DisplayName("과목 생성")
    void createTest() {
        assertThatCode(() -> new Course("OOP", 3, "A"))
                .doesNotThrowAnyException();
    }
}
