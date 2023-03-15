package discussion;

class Base {
	void show() {
		System.out.println("Base::show() called");
	}
}
class Derived extends Base {
		void show() {  		
		System.out.println("Derived::show() called");
	}
}
public class Main1 {
	public static void main(String[] args) {
		Base base = new Derived();
		base.show();
	}
}



