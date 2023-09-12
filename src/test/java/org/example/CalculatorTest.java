package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.Calculator.*;

/**
 * 요구사항
 * 간단한 사칙연산을 할 수 있다.
 * 양수로만 계산
 * 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생
 * MVC패턴 기반으로 구현
 */
public class CalculatorTest {

    @Test
    @DisplayName("덧셈 연산을 수행")
    void additionTest() {
        int result = calculate(1, "+", 2);
        assertThat(result).isEqualTo(3);
    }

//    @Test
//    @DisplayName("뺄셈 연산을 수행")
//    void subtractionTest() {
//        int result = calculate(1, "-", 2);
//        assertThat(result).isEqualTo(-1);
//    }
}
