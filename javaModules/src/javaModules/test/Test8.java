package javaModules.test;

import java.util.Scanner;

public class Test8 {
	
	static void oddSeries(int number1) {
		for(int num = 1; num<=number1; num+=2) {
			System.out.print(num+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num1 = scan.nextInt();
		System.out.println("Generate odd series numbers");
		oddSeries(num1);
		scan.close();
	}


}
