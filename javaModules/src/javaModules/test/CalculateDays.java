package javaModules.test;

import java.util.Scanner;

public class CalculateDays {
	static void toFindNoOfDays(int month){
		int noOfDays =0;
		switch(month) {
		case 1:
			noOfDays +=31;
			System.out.println("January");
		case 2:
			noOfDays +=28;
			System.out.println("February");
		case 3:
			noOfDays +=31;
			System.out.println("March");
		case 4:
			noOfDays +=30;
			System.out.println("April");
		case 5:
			noOfDays +=31;
			System.out.println("May");
		case 6:
			noOfDays +=30;
			System.out.println("June");
		case 7:
			noOfDays +=31;
			System.out.println("July");
		case 8:
			noOfDays +=31;
		case 9:
			noOfDays +=30;
		case 10:
			noOfDays +=31;
		case 11:
			noOfDays +=30;
		case 12:
			noOfDays +=31;
			break;
		default:
			System.out.println("Enter the Valid month");

		}
		System.out.println("Remaining no of days: "+noOfDays);

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int giveNum= scan.nextInt();
		toFindNoOfDays(giveNum);
		scan.close();
	}


}
