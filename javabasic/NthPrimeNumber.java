package com.javabasic;

public class NthPrimeNumber {
    public static void main(String[] args) {
        int num = 1, count = 0,i, n = 10;
        while (count < n) {
            num++;
            for (i = 2; i <num; i++) {
                if (num%i==0){
                    break;
                }
            }
            if (i==num)
                count++;
        }
        System.out.println("th prime number is "+num);
    }
}
