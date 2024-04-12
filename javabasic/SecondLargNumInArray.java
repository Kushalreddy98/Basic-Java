package com.javabasic;

public class SecondLargNumInArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 2, 26, 35, 85, 12, 60, 84};

        //Sorting an array inbuilt method
//         Arrays.sort(numbers);
//        for (int number:numbers) {
//            System.out.println(number);
//        }


//         Sorting an array inbuilt method
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length -i-1; j++) {
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        for (int num:numbers) {
            System.out.print(num+" ");
        }

        System.out.println();
        System.out.println("Second Largest Number is: "+numbers[numbers.length-2]);
//        int secondLargest = findSecondLargest(numbers);
//        System.out.println("The Second Largest Number in the Array is: " + secondLargest);
    }

//    public static int  findSecondLargest(int[] arr){
//        int largest=Integer.MIN_VALUE;
//        int secondLargest=Integer.MIN_VALUE;
//
//        for (int num: arr) {
//            if(num>largest){
//                secondLargest=largest;
//                largest=num;
//            } else if (num>secondLargest && num!=largest) {
//                secondLargest = num;
//            }
//        }
//        return secondLargest;
//    }
}
