package com.GeekstersAssignments;

public class Seprate_Array_Even_odd {
    public static void main(String[] args) {


    int[] a={2,6,8,9,6,7,9};

    int count=0;

    for (int i=0;i<a.length;i++){
        if (a[i]%2==0){
            a[count]=a[i];
            count++;
        }
    }
    for (int j=0;j< a.length;j++){
        if (a[j]%2==1){
            a[count]=a[j];
            count++;
        }
    }
        for (int e:a
             ) {
            System.out.print(e+" ");
        }





    }}
