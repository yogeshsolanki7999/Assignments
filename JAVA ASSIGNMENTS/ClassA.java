package com.java.assignments;

import java.util.Scanner;



public class ClassA {
	public static void main(String[] args) {
		//CALLING THE METHODD OF B 
		ClassB obj=new ClassB();

		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		int num1=scanner.nextInt();
		System.out.println("ENTER THE SECOND  NUMBER");
		int num2=scanner.nextInt();
		System.out.printf("SUM OF %d AND %d IS = %d",num1,num2,obj.add(num1,num2));
		
	}

	

}
