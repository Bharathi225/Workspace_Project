package javaModules.test;

import java.util.Scanner;

public class EvenOdd {
	
	static void checkEvenOdd(int num) {
		if(num%2==0) {
			System.out.println(num+" is even");
		}
		else{
			System.out.println(num+" is odd");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int giveNum= scan.nextInt();
		checkEvenOdd(giveNum);
	}

}
