package com.qa.LogicalProgram;

public class CountEvenOddNum {
	public static void main(String[] args) {
		
		int num = 12131415,countEven=0,countOdd=0;
		int rem;
		while(num>0) {
			rem = num%10;
			if(rem%2==0)
				countEven++;
			else
				countOdd++;
			num = num/10;
		}
		System.out.println("Even count = " + countEven);
		System.out.println("Odd count = " + countOdd);
	}

}
