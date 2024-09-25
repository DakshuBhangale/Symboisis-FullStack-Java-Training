package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Employee{
   int id;
   String name;
   int salary;
   String location;
   
   public Employee(int id, String name, int salary, String location) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.location = location;
   }

   @Override
    public String toString() {
	   return "Employee [id=" + id + ", nme=" + name + ", salary=" + salary + ", location=" + location + "]";
    }
}

class idCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.id == e2.id)
			return 0;
		else if(e1.id > e2.id)
			return 1;
		else
			return -1;
	}	
}

class nameCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.name.compareTo(e2.name);
	}
	
}

class salaryCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.salary == e2.salary)
			return 0;
		else if(e1.salary > e2.salary)
			return 1;
		else
			return -1;
	}	
}

class locationCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.location.compareTo(e2.location);
	}
	
}

public class Employrr_Search_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Employee> a1 = new ArrayList<Employee>();
     a1.add(new Employee(3,"Radhka",25000,"Nashik"));
     a1.add(new Employee(1,"Diksha",30000,"Pune"));
     a1.add(new Employee(8,"Aniket",12000,"Mumbai"));
     a1.add(new Employee(2,"Viraj",15000,"Kolkata"));
     a1.add(new Employee(5,"Tejas",20000,"Nagpur"));
     
     String key="";
     Scanner sc = new Scanner(System.in);
     while(true) {
    	 System.out.println("sorting by id");
    	 System.out.println("sorting by name");
    	 System.out.println("sorting by salary");
    	 System.out.println("sorting by location");
    	 System.out.println("Exit :exit");
    	 key=sc.next();
    	 switch(key) {
    	 case "id":
    		 System.out.println("Sorting by id......");
    		 Collections.sort(a1,new idCompare());
    		 for(Employee e :a1) {
    			 System.out.println(e);
    		 }
    		 break;
    		 
    	 case "name":
    		 System.out.println("Sorting by name......");
    		 Collections.sort(a1,new nameCompare());
    		 for(Employee e :a1) {
    			 System.out.println(e);
    		 }
    		 break;
    		 
    	 case "salary":
    		 System.out.println("Sorting by salary......");
    		 Collections.sort(a1,new salaryCompare());
    		 for(Employee e :a1) {
    			 System.out.println(e);
    		 }
    		 break;
    		 
    	 case "location":
    		 System.out.println("Sorting by location......");
    		 Collections.sort(a1,new locationCompare());
    		 for(Employee e :a1) {
    			 System.out.println(e);
    		 }
    		 break;
    		 
    	 case "exit":
    		 System.out.println("----------------");
    		 
    	 default:
     		   System.out.println("Exit the program.");
     		   break; 
    	 }//switch
     }//while
	}

}
