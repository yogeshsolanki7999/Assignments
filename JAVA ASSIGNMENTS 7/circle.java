package com.GeekstersAssignments;

import java.util.Scanner;

public class circle {
    public float circumference(float pi,float radius){
        float circum=2*pi*radius;
        return circum;
    } public float area(float pi,float radius){
        float area=pi*radius*radius;
        return area;
    }

    public static void main(String[] args) {
        float pi=3.14f;
        circle c=new circle();
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER RADIUS OF THE CIRCLE");
        float radius=s.nextFloat();
        System.out.println("AREA OF CIRLCLE IS "+c.area(pi,radius));
        System.out.println("CIRCUMFERENCE OF CIRLCLE IS "+c.circumference(pi,radius));


    }


}
