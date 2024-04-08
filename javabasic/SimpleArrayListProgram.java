package com.javabasic;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleArrayListProgram {
    public static void main(String[] args) {
        ArrayList<String> shoppingList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Creating a shopping List");
        System.out.println("Enter an item(or type 'done' to finish):");
        while (true){
            String item=scanner.nextLine();
            if(item.equalsIgnoreCase("done")){
                break;
            }
            shoppingList.add(item);
        }
        //Displaying the List
        System.out.println("\nYour Shopping List");
        for (String item:shoppingList) {
            System.out.println("-"+item);
        }
        //Removing an item
        System.out.println("Enter the item to remove");
        String itemToRemove=scanner.nextLine();
        if(shoppingList.remove(itemToRemove)){
            System.out.println(itemToRemove+" removed from list");
        }else{
            System.out.println("Item is not found in the list");
        }
        //Displaying the updated List
        System.out.println("\nYour Shopping List");
        for (String items:shoppingList) {
            System.out.println("-"+items);
        }

    }
}
