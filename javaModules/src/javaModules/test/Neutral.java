package javaModules.test;

import java.util.Scanner;

public class Neutral {

	static void checkWhole(int number) {
		if(number>0) {
			System.out.println(number+ "is positive");
		}
		else if(number == 0) {
			System.out.println(number+ "is whole number");
		}
		else {
			System.out.println(number+ "is negative");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Neutral obj = new Neutral();
		System.out.println("Enter the number:");
		int givenNum= scan.nextInt();
		checkWhole(givenNum);
		scan.close();
	}


}
