package javaModules.test;

import java.util.Scanner;

public class BuzzNum {

	static void checkBuzzOrNot(int num) {
		if((num%7==0)||(num%10==7)) {
			System.out.println(num+" is Buzz number");
		}
		else{
			System.out.println(num+" is not a Buzz number");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int giveNum= scan.nextInt();
		checkBuzzOrNot(giveNum);
		scan.close();
	}


}
