package com.GAssignments;


import java.util.Scanner;

public class Check_daigonal_element {
        public static void main(String[] args) {
            int [][] ar={{1,2,3},{2,1,5},{2,2,1}};
            int count=0;
            int ans=ar[0][0];



            for (int i=0;i<=ar.length-1;i++){
                for (int j=0;j<=ar[i].length-1;j++){
                   if (ar[i][j]==ans){
                       count++;
                       continue;
                   }
                   }

                }
            if (count==3){
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
            }
        }



