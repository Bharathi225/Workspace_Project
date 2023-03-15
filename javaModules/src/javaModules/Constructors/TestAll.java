package javaModules.Constructors;

class A{
	A(){
		System.out.println("A is Default");
	}
	A(int a){
		this();
		System.out.println("A is Parameter");
	}
}
class B extends A{
	B(){
		this(10);
		System.out.println("B is Default");
	}
	B(int a){
		super(20);
		System.out.println("B is Parameter");
	}
}
public class TestAll {

	public static void main(String[] args) {
		B b = new B();
		//B obj1 =new B(20);
	}

}
