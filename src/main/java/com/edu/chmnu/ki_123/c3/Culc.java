package com.edu.chmnu.ki_123.c3;

import static java.lang.Math.cos;
import static java.lang.Math.exp;
import static java.lang.Math.sin;

public class Culc {
    public static void main(String[] args) {
        double x = 7.1, a = 0.01, b = 5, c = 4.1;
        double y = exp(-a * x) * cos(b * x + c) + exp(a * x) * sin(c * x - 1);
        System.out.printf("Result is %.3f", y);
    }
}