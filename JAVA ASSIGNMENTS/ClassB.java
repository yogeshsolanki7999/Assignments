package com.java.assignments;

import java.util.Scanner;



public class ClassB {
	
	public static  int add(int x,int y) {
		
		int result=x+y;
		
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		int num1=scanner.nextInt();
		System.out.println("ENTER THE SECOND  NUMBER");
		int num2=scanner.nextInt();
		System.out.printf("SUM OF %d AND %d IS = %d",num1,num2,add(num1,num2));
		
		
	}
	

}
