package org.example.Calculator.calculate;

public interface NewArithmeticOperator {
    boolean support(String operator);
    int caclulate(PositiveNumber op1, PositiveNumber op2);
}
