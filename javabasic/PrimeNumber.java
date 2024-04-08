package com.javabasic;

public class PrimeNumber {
    static int  start = 2;
    static int  end = 15;


    public static void main(String[] args) {
        System.out.print("Prime Numbers b/w "+start+" and "+end+" are :");
        int  count = 0;
        int  sum = 0;
        for (int i = start; i <=end; i++) {
            boolean isPrime=true;
            for (int j = start; j < i; j++) {
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime==true){
                System.out.print(" "+i);
                count++;
                sum+=i;
            }
        }
        System.out.println();
        System.out.println("Prime Numbers count : "+count);
        System.out.println("Sum of Prime Numbers b/w "+start+" and "+end+" are : "+sum);
    }


}
