package com.bl.Hashmap;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words =sentence.toLowerCase().split(" ");

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
