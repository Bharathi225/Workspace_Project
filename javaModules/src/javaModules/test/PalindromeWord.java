package javaModules.test;

import java.util.Scanner;

public class PalindromeWord {

	static int toReverse(int number) {  //2345
		int rev =0;
		while(number!=0) {
			//2345  = 5432

			int rem = number%10; // (5)
			number = number/10;  //(234)
			rev = (rev*10)+rem; //5
			//System.out.println(rev);
		}
		return rev; 
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int userInput = scan.nextInt();
		int reverseNum = toReverse(userInput);
		System.out.println("Reverse of Num: "+ reverseNum);
		if(userInput == reverseNum) {
			System.out.println(userInput + " is Palindrome");
		}else {
			System.out.println(userInput + " is not a Palindrome");
		}
		scan.close();
	}

}
