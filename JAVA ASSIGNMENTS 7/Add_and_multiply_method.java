package com.GeekstersAssignments;
import java.util.Scanner;

public class Add_and_multiply_method {
    public int add(int a,int b){

        return a+b;

    }
    public int multiply(int a,int b){

        return a*b;

    }

    public static void main(String[] args) {
         Add_and_multiply_method obj=new Add_and_multiply_method();
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
        int a=s.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int b=s.nextInt();
        System.out.println("NOW ENTER SUM/sum OR multiply/MULTIPLY");
        s.nextLine();
        String str= s.nextLine();
        if (str.equalsIgnoreCase("sum")){
            int result=obj.add(a,b);
            System.out.printf("THE SUM OF %d AND %d IS =%d ",a,b,result);

        }
        else if (str.equalsIgnoreCase("multiply")){
            int result=obj.multiply(a,b);
            System.out.printf("THE SUM OF %d AND %d IS =%d ",a,b,result);

        }
        else {
            System.out.println("YOU ENTERED INVALID OPERATOR NAME");
        }
    }}


