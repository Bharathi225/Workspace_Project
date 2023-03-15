package javaModules.test;

import java.util.Scanner;

public class Factorial {

	static int calculateFact(int userNum) {
		int ctr=1;
		int fact=1;
		while(ctr<=userNum) {
			fact=fact*ctr;   //fact*=ctr;                                      
			ctr++;
		}
		//System.out.println(fact);
		return fact;
		 	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int userInput = scan.nextInt();
		calculateFact(userInput);			
		scan.close();
	}

}
