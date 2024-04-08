package com.javabasic;

public class Fibbonacci {
    static int num1 = 0;
    static int num2 = 1;
    static int num3 = 0;

    public static void main(String[] args) {
        int count = 15;
        System.out.println("Printing Fibbonacci series");
        for (int i = 0; i < count; i++) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}
