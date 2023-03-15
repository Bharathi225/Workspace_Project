package javaModules.test;

import java.util.Scanner;

public class CheckNum {

	void checkPosNeg(int number) {
		if(number>0) {
			System.out.println("positive");
		}
		else {
			System.out.println("negative");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CheckNum check = new CheckNum();
		System.out.println("Enter the number:");
		int givenNum= scan.nextInt();
		check.checkPosNeg(givenNum);
	}

}
