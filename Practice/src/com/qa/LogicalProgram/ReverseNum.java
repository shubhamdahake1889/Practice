package com.qa.LogicalProgram;

public class ReverseNum {
	public static void main(String[] args) {
		//12345 -> 54321
		int num = 12345,revNum=0,rem,multiFactor=10000;
		System.out.println("Origional Number =" + num);
		for(int i=0;i<5;i++) {
			rem = num%10;
			num = num/10;
			revNum = revNum + rem*multiFactor;
			multiFactor=multiFactor/10;
			System.out.println("Reverse by iteration =" + revNum);
		}
		System.err.println("Final Reversal =" + revNum);
	}

}
