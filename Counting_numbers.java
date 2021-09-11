package com.java.assignments;

import java.util.Iterator;

public class Counting_numbers {

	public static void main(String[] args) {
		int num =56655;
		int count =0;
		for (int i=0;num>0;i++ ) {
			num=num/10;
			count=count+1;
			
		}
		System.out.println(count);
		
	}
}
