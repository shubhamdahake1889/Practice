package com.qa.LogicalProgram;

public class Prog1 {

	public static void main(String[] args) {

		// Increasing Triangle
		
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");

		
		int a=5;      // Decreasing Triangle
		for(int i = 1; i<=a; i++) {
			for(int j=i; j<=a; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
