package com.javabasic;

import java.util.Arrays;

public class SumOfTwo2DArray {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        int[] c=new int[a.length];

        int sum=0;
        if (a.length==b.length){
            for (int i = 0; i < a.length; i++) {
                sum=sum+a[i]+b[i];
                c[i]= a[i] + b[i];
            }
        }else
            System.out.println("Length is not matching");
        System.out.println(sum);
        System.out.println(Arrays.toString(c));
    }
}
