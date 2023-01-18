package com.qa.LogicalProgram;

public class Factorial {

	public static void main(String[] args) {

		//5! = 1 x 2 x 3 x 4 x 5= 120
		int num = 5, fact = 1;
		for(int i=1;i<=num;i++) //i=5
		{                             //4x4 =1
			fact = fact*i;    //
		}
		System.out.println("Factorial of" + num +" =" +fact);
	}

}
