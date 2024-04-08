package com.javabasic;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  the String 1");
        String s1 = scanner.next();
        System.out.println("Enter  the String 2");
        String s2 = scanner.next();

        if (s1.length() == s2.length()) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
//            Arrays.sort(c1);
//            Arrays.sort(c2);
            boolean result = equals(c1, c2);
            if (result == true)
                System.out.println("Entered Strings are anagram");
            else
                System.out.println("Entered Strings are not anagram");
        }
        else
            System.out.println("Entered Strings are not anagram");
    }

    static boolean equals(char[] a1, char[] a2) {
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
}
