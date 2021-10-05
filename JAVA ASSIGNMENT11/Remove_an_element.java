package com.GeekstersAssignments;

public class Remove_an_element {
    public static void main(String[] args) {
        //REMOVING THE ELEMENT BY USING ANOTHER ARRAY
        int a[]={1,2,4,5,7};
        int k=5;

        for (int i=0 ;i<= a.length-1;i++)
        {
            if (a[i]==k){
                for (int j=i;j< a.length-1;j++){
                    a[j]=a[j+1];
                }
                break;
            }
        }
        for (int i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }

    }
}
