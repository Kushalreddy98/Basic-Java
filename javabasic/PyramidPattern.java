package com.javabasic;

public class PyramidPattern {
    public static void main(String[] args) throws InterruptedException {
//        for(int row=5;row>0;row--){
//            for(int col=5;col>=1;col--){
//                if(row>=col)
//                {
//                    //Thread.sleep(3000);
//                    System.out.print(" *");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }


//            for(int row=1;row<=4;row++){
//                for(int col=1;col<=row;col++){
//                    Thread.sleep(30);
//                    System.out.print("*");
//                }
//                for(int col=2*row;col<2*4;col++){
//                    System.out.print(" ");
//                }
//                for(int col=1;col<=row;col++){
//                    Thread.sleep(30);
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

//        for(int row=1;row<=5;row++){
//            for(int col=5;col>=1;col--){
//                if(row>=col)
//                {
//                    //Thread.sleep(30);
//                    System.out.print(" *");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


