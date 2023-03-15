package javaModules.test;

import java.util.Scanner;

public class Tables {
	 static void tablesNum(int num, int limit) {
		 for(int ctr=1;ctr<=limit; ctr++) {
			 System.out.println(num+" X "+ ctr+" = "+(num*ctr));
		 }
	 }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		byte number = scan.nextByte();
		System.out.println("Enter the limits:");
		byte limits = scan.nextByte();
		tablesNum(number,limits);
		scan.close();
	}

}
