package com.GAssignments;

import java.util.HashMap;

public class Char_frequency_hashmap {
    public static void main(String[] args) {
        String str="aaabbbcccddeeeffffksacd";
        HashMap<Character,Integer> map=new HashMap<>();
        char[] ch=str.toCharArray();
        for (int i=0;i<=ch.length-1;i++){
            if(map.containsKey(ch[i])){
                Integer val=map.get(ch[i]);
                val=val+1;
                map.put(ch[i],val);

            }else {

                map.put(ch[i],1);

            }
        }
        for (Character el: map.keySet()
             ) {
            System.out.println("key=  "+el+"       frequency=  "+map.get(el));
        }
    }
}
