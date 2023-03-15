package javaModules.Constructors;

public class Employee {
	 int id;
	 String name;
	 String cmpy;

	Employee(int id, String name,String cmpy){
		this.id=id;
		this.name=name;
		this.cmpy=cmpy;
	}

	void worker() {
		System.out.println(id +" "+ name +" "+ cmpy);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(10,"Bharathi","ABC");
		Employee e2 = new Employee(20,"Shruthi","ABC");
		Employee e3 = new Employee(30,"Shiva","ABC");
		e1.worker();
		e2.worker();
		e3.worker();
	}

}
