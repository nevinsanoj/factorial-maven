package com.example;

public class Factorial {

    public long findFactorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Factorial of 5 = " + f.findFactorial(5));
    }
}