package javaModules.test;

import java.util.Scanner;

public class Test16 {

	static int calKMNum(int userNum) {
		int catchFact = 0;
		for(;userNum!=0;){ 
			int rem = userNum%10;  //145%10 =5
			 catchFact += Factorial.calculateFact(rem);  //5! 
			userNum = userNum/10; //145/10=14
		}
		return catchFact;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int userInput = scan.nextInt();
		int catchFact = calKMNum(userInput);
		if(catchFact == userInput) {
			System.out.println("This is a KM number");
		}else {
			System.out.println("This is not a KM number");
		}
		scan.close();
	}

}
