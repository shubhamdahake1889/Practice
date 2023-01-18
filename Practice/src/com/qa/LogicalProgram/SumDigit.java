package com.qa.LogicalProgram;

public class SumDigit {
	public static void main(String[] args) {
		
		int num = 123456,rem, sum=0;
		while(num>0) {
			rem = num%10;
			sum = sum + rem;
			num = num/10;
			System.out.println("Sum by iteration =" + sum);
		}
		System.out.println("------");
		System.out.println("Final Sum =" + sum);
	}

}
