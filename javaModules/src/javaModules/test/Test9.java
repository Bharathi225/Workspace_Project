package javaModules.test;

import java.util.Scanner;

public class Test9 {

	static void pattern(int userInput) {
		if(userInput%2!=0) {
			System.out.println("odd number");
		}else if((userInput>=2)&&(userInput<=5)) {
			if(userInput%2==0) {
				System.out.println("not wierd");
			}
		}else if((userInput>=6)&&(userInput<=20)) {
			if(userInput%2==0) {
				System.out.println("wierd");
			}
		}else if((userInput%2==0)&&(userInput>=20)) {
			System.out.println("not wierd");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int userIn= scan.nextInt();
		pattern(userIn);
		scan.close();
	}
}
