package com.javabasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Using ArrayList and HashMap
public class FruitsList {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        Map<String,Integer> mapList=new HashMap<>();
        System.out.println(mapList);
        for (String fruit:fruits) {
            if(mapList.containsKey(fruit)){
                mapList.put(fruit,mapList.get(fruit)+1);
            }else{
                mapList.put(fruit,1);
            }
        }
        System.out.println(mapList);
    }
}
