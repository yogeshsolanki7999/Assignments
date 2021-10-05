package com.GeekstersAssignments;

public class Merge_two_sorted_array {
    public static void main(String[] args) {
        int ar1[]={1,2,3,4};
        int ar2[]={4,5,6,7,8};
        int length=ar1.length+ar2.length;
        int count=ar1.length;
        int[] merg=new int[length];


        for (int i=0;i<=ar1.length-1;i++){

            merg[i]=ar1[i];
        }
        for (int j=0;j<=ar2.length-1;j++){
            merg[count]=ar2[j];
            count++;
        }
        for (int el:merg
             ) {
            System.out.println(el);
        }
    }
}
