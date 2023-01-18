package com.qa.LogicalProgram;

public class ReverseNumByString {
	public static void main(String[] args) {
		int num = 123456;
		String strNum = Integer.toString(num);
		String revNum = "";

		for (int i = strNum.length() - 1; i >= 0; i--) 
		{
			char ca = strNum.charAt(i);
			revNum=revNum+ca;
		}
		System.out.println("Reverse Num =" + revNum);

	}

}
