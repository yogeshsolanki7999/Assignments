package com.GeekstersAssignments;

public class ClassA_overloading {

    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void add(double a,double b){
        System.out.println(a+b);
    }

    public   void show(){
        add(4,6);
        add(4,6,8);
        add(4.55,8.66);

    }
}
