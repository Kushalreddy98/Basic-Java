package com.javabasic;

import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={5,6,7,8};
        int[] c=new int[a.length+b.length];
        int k=0;
        for (int i = 0; i <a.length ; i++) {
            c[k]=a[i];
            k++;
        }
        for (int i = 0; i <b.length ; i++) {
            c[k]=b[i];
            k++;
        }
        for (int c1:c) {
            System.out.println(c1);
        }
        System.out.println(Arrays.toString(c));
    }
}
