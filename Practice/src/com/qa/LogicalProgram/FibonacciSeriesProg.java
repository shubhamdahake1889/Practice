package com.qa.LogicalProgram;

public class FibonacciSeriesProg {

	public static void main(String[] args) {

		int num1 = 0,num2=1;
		System.out.print(num1 + " " + num2);
		for(int i=0;i<10;i++) {
			int sum = num1 + num2;
			System.out.print(" " + sum);
			num1 = num2;
			num2=  sum;
		}
		System.out.println("-------------------------");
		int a=0, b=1;
		int c;
		System.out.print(a + " " + b);
		for(int i=1; i<=5;i++) {
			c=a+b;
			System.out.print(" "+ c);
			a = b;
			b = c;
		}
	}

}
