package EmployeeManagementSystem;
public class Employee {
   private String name;
   private int age;
   private String designation;
   private String department;
   private double salary;
   
   public Employee() {
	   //System.out.println("to print all the employees");
   }
   
   public Employee(String name, int age, String designation, String department, double salary) {
	    this.name = name;
	    this.age = age;
	    this.designation = designation;
	    this.department = department;
	    this.salary = salary;
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String toString(Employee e) {
	return "Employee[ Name : "+e.getName()+" Age : "+e.getAge()+" Designation : "+e.getDesignation()+" Department : " + e.getDepartment() + " Salary : "+e.getSalary()+" ]";
}
//
//public void addEmployee(Employee e, ArrayList<Employee> l) {
//	l.add(e);
//}
//
//public void deleteEmployee(Employee e, ArrayList<Employee> l) {
//	l.remove(e);
//}

//public void updateEmployee(Employee e, ArrayList<Employee> l, int i, String name, int age, String designation, String department, double salary) {
//	e.setName(name);
//	e.setAge(age);
//	e.setDesignation(designation);
//	e.setDepartment(department);
//	e.setSalary(salary);
//	l.set(i, e);
//}
//
//public void viewEmployee(Employee e) {
//	e.toString();
//}
//
//public void viewAllEmployees(ArrayList<Employee> l) {
//	for(int i=0; i<l.size(); i++) {
//		System.out.println(l.get(i));
//	}
//}



//public void exit() {
//	System.exit(-1);
//}
}