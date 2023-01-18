package com.qa.LogicalProgram;

public class LargestofThreeNumbers {

	public static void main(String[] args) {

		int a = 41, b=42, c=44;
		if (a>b && a>c) 
			System.out.println("Largest Number =" + a);
		if(b>a && b>c)
			System.out.println("Largest Number =" + b);
		if(c>a && c>b)
			System.out.println("Largest Number =" + c);
			
		
	}

}
