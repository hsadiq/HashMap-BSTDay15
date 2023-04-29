package com.bl.Hashmap;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words =sentence.toLowerCase().split(" ");

        for(String word: words){
            if (map.containsKey(word)){
                int Value = map.get(word);
                map.put(word, Value + 1);
            }else {
                map.put(word, 1);
            }
        }

        map.remove("avoidable");
        System.out.print(map);

    }
}
