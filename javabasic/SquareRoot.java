package com.javabasic;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=scanner.nextInt();
        int temp=0;
        int count=0;
        int square=num/2;
        do {
            temp=square;
            square=(temp+(num/temp))/2;
            count++;
        }while (temp-square!=0);
        System.out.println("SquareRoot of "+num+" is : "+square+"\nThe no of iterations are : "+count);
    }
}
