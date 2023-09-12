package org.example;

public class Calculator {
    public static int calculate(int op1, String operator, int op2) {
        if ("+".equals(operator)) {
            return  op1 + op2;
        }else if ("-".equals(operator)){
            return  op1 - op2;
        }
        return 0;
    }
}
