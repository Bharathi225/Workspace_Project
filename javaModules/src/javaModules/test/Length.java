package javaModules.test;

import java.util.Scanner;

public class Length {
	static void toFindLength(int userNum) { //123
		int count = 0;
		while(userNum>0) {

			count++; //1
			userNum = userNum/10;      //123/10 =12
		} System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int userInput = scan.nextInt();
		toFindLength(userInput);
	}



}
