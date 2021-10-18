package com.GAssignments;

import java.util.HashMap;
import java.util.Scanner;

public class Student_Hashmap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"YOGESH");
        map.put(2,"SANJAY");
        map.put(3,"AKANSHA");
        map.put(4,"RAABISH");
        map.put(5,"SHIKHA");

        for (Integer el:map.keySet()
             ) {
            System.out.println("key="+el+" value="+map.get(el));
        }
        }
    }

