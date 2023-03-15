package discussion;

import java.util.Scanner;

public class NeonNum {
	static void checkNeonNum(int number) {
		int square = number*number;
		int sum = 0;
		while(square!=0) {
			sum+= square % 10;
			square = square/10;
		}
		System.out.println(sum==number?"Neon number":"not a neon number");
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = scan.nextInt();
	checkNeonNum(num);
	scan.close();
	}

}
