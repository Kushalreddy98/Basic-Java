package com.javabasic;

public class Factorial {

    public static void main(String[] args) {
        int factorial=5;
        int fact=1;

        for (int i = factorial; i >=1 ; i--) {
            fact=fact*i;
        }
        System.out.println("Factorial of the "+factorial+" is "+fact);
    }
}
