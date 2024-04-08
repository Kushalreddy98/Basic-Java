package com.javabasic;

public class Palindrome {
    public static void main(String[] args) {
        String value = "malayalam";
        boolean result = reverse(value);
        if (result == true)
            System.out.println("Given String is palindrome");
        else
            System.out.println("Given String is not palindrome");


        int num=1232;
        int rev=resverseNum(num);
        if(num==rev)
            System.out.println("Given number is a palindrome");
        else
        System.out.println("Given number is a palindrome");
    }

    static boolean reverse(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i <= j) {
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static  int resverseNum(int num){
        int rev=0, rem;
        while (num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num /=10;
        }
        return rev;

    }
}
