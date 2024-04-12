package com.javabasic;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={20,35,63,24,12,9,123,85,71,0};
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println("Sorting using inbuilt method");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
