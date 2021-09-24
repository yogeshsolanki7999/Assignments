package com.GeekstersAssignments;

public class CheckConstructor {
    public static void main(String[] args) {

            //DEFAULT CONSTRUCTOR
        Student2_Constructor obj1=new Student2_Constructor();
            obj1.show();

            //FOR CHANGING LINE
        System.out.format("\n");
        System.out.format("\n");
        System.out.format("\n");


           //BY USING PARAMETRIZED CONSTRUCTOR
        Student2_Constructor obj=new Student2_Constructor("YOGESH","SOLANKI",
                "CS55","78","799994152","RED",10);
                        obj.show();




}
}
