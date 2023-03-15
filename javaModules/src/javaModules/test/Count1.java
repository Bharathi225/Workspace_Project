package javaModules.test;

public class Count1 {

	public static void main(String[] args) {
		int a[] = {2,1,3,1,4,5,1,6};
		//int ar = 1;
		int count =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
