package javaModules.test;

import java.util.Scanner;

public class Factors {

	static void toCheckFactor(int userNum) {
		//boolean flag = false;
		System.out.print("Enter the factor numbers are :  ");
		int count=0;
		for(int ctr=1;ctr<=userNum;ctr++) {
			if(userNum%ctr==0) {
			//	flag=true;
				System.out.print(ctr+" ");
				count++;
			}
		}System.out.println();
		System.out.println("Total no of factors: "+count);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int userInput = scan.nextInt();
		toCheckFactor(userInput);			
		scan.close();
	}
}
