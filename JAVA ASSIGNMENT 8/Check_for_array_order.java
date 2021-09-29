package com.GeekstersAssignments;

import java.util.Scanner;
//
public class Check_for_array_order {
    public boolean checkOrder(int arr[]){
        boolean result=false;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]<arr[i+1]){
                result=true;
            }else {
                result=false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int array[]=new int[5];

        for (int i=0;i<= array.length-1;i++){
            System.out.println("ENTER THE VALUE FOR INDEX  "+i);
            array[i]=s.nextInt();
        }
        Check_for_array_order obj=new Check_for_array_order();

        if (obj.checkOrder(array)==true){
            System.out.println("ARRAY IS IN ACCENDING ORDER");
        }
        else {
            System.out.println("ARRAY IS NOT IN ACCENDING ORDER");
        }
    }
}
