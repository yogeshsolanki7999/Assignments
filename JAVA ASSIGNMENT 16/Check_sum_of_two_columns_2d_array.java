package com.GAssignments;

import java.util.Scanner;

public class Check_sum_of_two_columns_2d_array {
    public static void main(String[] args) {
        int[][] ar=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<=ar.length-1;i++){
            for (int j=0;j<=ar[i].length-1;j++){
                ar[i][j]=sc.nextInt();

            }
        }

        int count=0;

        for (int i=0;i<ar.length;i++){


                if (ar[i][0]+ar[i][1]==ar[i][2]){
                    count++;



            }
        }
        if( count==3){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
