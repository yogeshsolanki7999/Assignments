package com.java.assignments;

import java.util.Scanner;

public class TypeCasting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//IMPLICIT TYPE CASTING
		short s=sc.nextByte();
		int i=sc.nextShort();
		long l=sc.nextInt();
		float f=sc.nextLong();
		double d=sc.nextFloat();
		
		//EXPLICIT TYPE CASTING 
		byte bb=(byte) sc.nextShort();
		short ss=(short) sc.nextInt();
		int ii=(int) sc.nextLong();
		long ll=(long) sc.nextFloat();
		float ff=(float) sc.nextDouble();
		
		sc.close();
	}

}
