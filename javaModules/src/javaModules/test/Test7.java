package javaModules.test;

import java.util.Scanner;

public class Test7 {

	static void evenSeries(int number) {
		for(int num = 0; num<=number; num+=2) {
			System.out.print(num+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num1 = scan.nextInt();
		System.out.println("Generate even series numbers");
		evenSeries(num1);
		scan.close();
	}

}
