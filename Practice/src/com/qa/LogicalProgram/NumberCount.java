package com.qa.LogicalProgram;

public class NumberCount {

	public static void main(String[] args) {

		int num= 12131415, count=0;
		while(num>0) {   //0>0 
			num = num/ 10;  //num=0
			count++;          //count = 
		}
		System.out.println("Number of count of given no = " + count);
	}

}
