package com.javabasic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = scanner.nextInt();
        int num1 = num;
        int copy = num;
        int count = 0;
        int sum = 0;
        while (num1 != 0) {
            num1 = num1 / 10;
            count++;
        }
        while (num != 0) {
            int rem = num % 10;
            sum = sum + (int) Math.pow(rem, count);
            num = num / 10;
        }
        if (copy == sum)
            System.out.println(copy + " is Armstrong number");
        else
            System.out.println(copy + " is Armstrong number");
    }
}
