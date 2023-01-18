package com.qa.LogicalProgram;

public class ArmstrongNum {

	public static void main(String[] args) {

		//371 = 3x3x3 + 7x7x7 + 1x1x1 = 371
		int num = 371,rem,sum=0,num1;
		num1 = num;
		System.out.println("Origional Number = " + num);
		
		while(num>0) {
			rem = num%10; //3%10=3
			sum = sum + rem*rem*rem; //344 +(3*3*3) = 371
			num = num/10;      //3/10 = 0
			}
		System.out.println("Result = " + sum);
		if(num1 == sum)
			System.out.println(num1 + " is Armstrong Num");
		else
			System.out.println("Not Armstrong Num");
	}

}
