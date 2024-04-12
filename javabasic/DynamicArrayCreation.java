package com.javabasic;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrayCreation {
    public static void main(String[] args) {
        int[] akk=inputArray();
        System.out.print("Entered Array is -"+Arrays.toString(akk));
    }
    static int[] inputArray(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the index values");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
}
