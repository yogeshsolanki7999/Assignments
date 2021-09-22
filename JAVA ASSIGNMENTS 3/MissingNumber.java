package com.GeekstersAssignments;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,15};
        for (int i=0;i<=arr.length-1;i++){
            if(arr[i]!=arr[i+1]-1){
                System.out.println("THE MISSING NUMBER IS  ="+(arr[i]+1));
            }
        }
    }
}
