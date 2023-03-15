package javaModules.test;

import java.util.Scanner;

public class Test4 {
	
	static void Generate(int num1, int num2) {
	for(int check=num1; check<=num2; check++) {
		System.out.print(check+" ");
	}
	}
	static void Gener(int num1,int num2) {
	while(num1<=num2) {
		System.out.print(num1+" ");
		num1++;
	}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int user1 = scan.nextInt();
		System.out.print("Enter 2nd number: ");
		int user2 = scan.nextInt();
		System.out.println("Generate series numbers for loop");
		Generate(user1,user2);
		System.out.println();
		System.out.println("Generate series numbers while loop");
		Gener(user1,user2);
		scan.close();
	}

}
