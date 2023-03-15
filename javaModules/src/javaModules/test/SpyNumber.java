package javaModules.test;

import java.util.Scanner;

public class SpyNumber {
	static void checkSpyOrNot(int userNum) {
		int sum = 0;
		int product = 1;
		while(userNum!=0) {
			int rem = userNum%10;
			sum += rem;
			product *= rem;
			userNum = userNum/10;
		}
		System.out.println(sum == product ? "Spy number": "Not a Spy number");
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int giveNum= scan.nextInt();
		checkSpyOrNot(giveNum);
	
	}

}
