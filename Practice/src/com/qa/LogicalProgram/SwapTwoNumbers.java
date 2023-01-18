package com.qa.LogicalProgram;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a=15, b=25;
		System.out.println("Orignal A =" + a + " B = " + b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println("After Swapping A =" + a + " B = " + b);
		
	}

}
