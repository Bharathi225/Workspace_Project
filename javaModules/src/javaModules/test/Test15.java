package javaModules.test;

import java.util.Scanner;

public class Test15 {

	static int calReminder(int reminder) {
		return reminder * reminder * reminder;  //3*3*3=27
	}
	static int calArmstrongNum(int userNum) {
		int sum =0;
		for(;userNum!=0;){ 
			int rem = userNum%10;  //153%10 =3
			sum+= calReminder(rem);  //
			userNum = userNum/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Armstrong number: ");
		int userInput = scan.nextInt();
		int calculateInput = calArmstrongNum(userInput);
		scan.close();
		if(calculateInput == userInput) {
			System.out.println("This is a Armstrong number");
		}else {
			System.out.println("This is not a Armstrong number");
		}
	}

}
