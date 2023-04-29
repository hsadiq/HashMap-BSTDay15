package com.bl.Hashmap;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        String sentene = "To be or to be not";
        String[] words =sentene.toLowerCase().split(" ");

        for(String word: words){
            Integer Value = map.get(word);
            if(Value == null){
                Value = 0;
            }
            Value +=1;
            map.put(word,Value);
        }
        System.out.print(map);

    }
}
