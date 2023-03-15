package javaModules.test;

import java.util.Scanner;

public class Test5 {

	static void checkPosNeg(int number) {
		int ctr = 1;
		while(ctr<=number) {
			CheckNum checkNum = new CheckNum();
			checkNum.checkPosNeg(number);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int givenNum =  scan.nextInt();
		checkPosNeg(givenNum);
		scan.close();
	}

}
