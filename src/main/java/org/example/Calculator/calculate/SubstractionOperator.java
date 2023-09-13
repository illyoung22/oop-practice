package org.example.Calculator.calculate;

public class SubstractionOperator implements NewArithmeticOperator {
    @Override
    public boolean support(String operator) {
        return "-".equals(operator);
    }

    @Override
    public int caclulate(PositiveNumber op1, PositiveNumber op2) {
        return op1.toInt() - op2.toInt();
    }
}
