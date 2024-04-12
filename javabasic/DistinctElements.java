package com.javabasic;

public class DistinctElements {
    public static void main(String[] args) {
        System.out.println("Printing Duplicates");
        int[] nums = {1, 2, 3, 4, 5, 2, 1, 9};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    System.out.print(nums[i]+" ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Printing Distict elements in an Integer array");
        for (int i = 0; i < nums.length; i++) {
            boolean flag = true;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    flag = false;
                    break;
                }

            }
            if (flag == true)
                System.out.print(nums[i] + " ");

        }

        System.out.println();
        System.out.println();
        System.out.println("Printing Distict elements in an Character array");
        char[] chars = {'b', 'c', 'd', 'd', 'k', 'c', 'u', 'e', 's', 'e', 'h', 'a', 'b', 'l'};
        for (int i = 0; i < chars.length; i++) {
            boolean flag = true;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j] && i != j) {
                    flag = false;
                    break;
                }

            }
            if (flag == true)
                System.out.print(chars[i] + " ");

        }
        System.out.println();
    }
}
