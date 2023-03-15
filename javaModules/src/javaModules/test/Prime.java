package javaModules.test;

import java.util.Scanner;

public class Prime {

	static void toCheckPrime(int userNum) {
		boolean flag = false;
		for(int ctr=2; ctr<userNum; ctr++) {
			if(userNum%ctr==0) {
				flag=true;
				break;
			}
		}
		System.out.println(flag==true ? "Not Prime" : "Prime");
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Prime number: ");
		int userInput = scan.nextInt();
		toCheckPrime(userInput);			
		scan.close();
	}
}
