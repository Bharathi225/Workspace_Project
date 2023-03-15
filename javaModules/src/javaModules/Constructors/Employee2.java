package javaModules.Constructors;

public class Employee2 {
	
	   String name;
	   int id;
	   static String CmpnyName = "ABC";
	   
	   Employee2(int id,String name)
	   {
	     this.id=id;
	    this.name=name;
	   }
	  
	    public void display()
	    {
	      System.out.println("employee id:"+" "+this.id +" "+"employee name:"+
	    " "+this.name+" "+ "Company:"+" "+Employee2.CmpnyName);
	    }
	    
	    
	  @Override
		public String toString() {
			return "Employee2 [name=" + name + ", id=" + id + ", Company=" + "CmpnyName]";
		}

	public static void main(String args[])
	  {
	    System.out.println("the employee details are:");
	    Employee2 e1=new Employee2(1,"bharathi");
	    Employee2 e2=new Employee2(2,"ammu");
	    Employee2 e3=new Employee2(3,"vasu");
	    e1.display();
	    e2.display();
	    e3.display();
	    System.out.println(e1);
	    System.out.println(e2);
	    System.out.println(e3);
		  
	  }
	
	  }
