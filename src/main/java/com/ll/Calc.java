package com.ll;

public class Calc {
    public static int run(String expr) {
        String[] exprBits = expr.trim().split("\\s+\\+\\s+");

        int num1 = Integer.parseInt(exprBits[0]);
        int num2 = Integer.parseInt(exprBits[1]);

        return num1 + num2;
    }
}
