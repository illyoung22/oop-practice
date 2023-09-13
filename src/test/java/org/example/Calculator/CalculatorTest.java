package org.example.Calculator;

import org.example.Calculator.calculate.Calculator;
import org.example.Calculator.calculate.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.example.Calculator.calculate.Calculator.*;

/**
 * 요구사항
 * 간단한 사칙연산을 할 수 있다.
 * 양수로만 계산
 * 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생
 * MVC패턴 기반으로 구현
 */
public class CalculatorTest {

    @ParameterizedTest
    @DisplayName("덧셈 연산을 수행")
    @MethodSource("formulaAndResult")
    void calculateTest(PositiveNumber op1, String operator, PositiveNumber op2, int result) {
        int calculateResult = calculate(op1, operator, op2);
        assertThat(calculateResult).isEqualTo(result);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                Arguments.arguments(1, "+" ,2,3),
                Arguments.arguments(1, "-" ,2,-1),
                Arguments.arguments(4, "*" ,2,8),
                Arguments.arguments(4, "/" ,2,2)
        );
    }

//    @Test
//    @DisplayName("뺄셈 연산을 수행")
//    void subtractionTest() {
//        int result = calculate(1, "-", 2);
//        assertThat(result).isEqualTo(-1);
//    }

    @Test
    @DisplayName("나눗셈에서 0을 나누는 경우 IllegalArgument 발생시킨다.")
    void calculateException() {
        assertThatCode(()-> Calculator.calculate(new PositiveNumber(10),"/",new PositiveNumber(0)))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("0으로 나눌수 없습니다.");
    }
}
