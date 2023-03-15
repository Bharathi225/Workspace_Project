package javaModules.test;

public class Test12345 {

	public static void main(String[] args) {
		int a = 123456;
		int sum=0;
		while(a>0) {
			int rem = a%10;
			a = a/10;
			sum=sum+rem;
		}
		System.out.println(sum);
	}
}
