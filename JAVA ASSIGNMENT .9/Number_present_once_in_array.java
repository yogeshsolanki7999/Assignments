package com.GeekstersAssignments;

public class Number_present_once_in_array {

    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 10, 40, 30, 40};
        int count=0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j =0; j <= arr.length - 1; j++) {
                if (i==j){
                    continue;
                }
                if (arr[i]==arr[j]){
                    count=count+1;
                    break;
                }
               else if (j== arr.length-1){
                    System.out.println(arr[i]+" ");
                }


            }
        }
        System.out.println("THE ELEMENT WHICHH OCCUR MORE THAN ONCE"+count);


    }}