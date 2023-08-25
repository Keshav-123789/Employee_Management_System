package EmployeeManagementSystem;
import java.util.*;
public class Menu {
	public static void main(String[] args) {
		int i,size,index,pos;
		String name, designation, department;
		int age,flag=1;
		double salary;
		ArrayList<Employee> l = new ArrayList<Employee>();
		Employee[] e;
	    e = new Employee[100];
		e[0] = new Employee("Keshav", 20, "SDE", "Sales", 50000.00);
	    e[1] = new Employee("Aditya", 14, "Intern", "Marketing", 60000.00);
		e[2] = new Employee("Madhav", 50, "Lead Design Engineer", "Manufacturing", 100000.00);
		e[3] = new Employee("Sunitha", 45, "Project Manager", "Finance", 70000.00);
		l.add(e[0]);
		l.add(e[1]);
		l.add(e[2]);
		l.add(e[3]);
		
		size = l.size();
       do {
 
		System.out.println("Menu for Employee Management System:-");
		System.out.println("1-Add Employee");
		System.out.println("2-Delete Employee");
		System.out.println("3-Update Employee");
		System.out.println("4-View Employee");
		System.out.println("5-View All Employees");
		System.out.println("6-Exit");  
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
	
		switch(i) {
		case 1:
			System.out.print("Enter employee name:");
			name = sc.next();
			System.out.print("Enter employee age: \n");
			age = sc.nextInt();
			System.out.print("Enter employee designation: \n");
			designation = sc.next();
			System.out.print("Enter employee department: \n");
			department = sc.next();
			System.out.print("Enter employee salary: \n");
			salary = sc.nextDouble();
			e[size] = new Employee(name, age, designation, department, salary);
			l.add(e[size]);
			size++;
			break;
		
		case 2:
		    System.out.println("enter the index of the employee that you want to delete: ");
		    index = sc.nextInt();
		    l.remove(index);
		    size--;
		    break;
		
		case 3:
			System.out.println("enter the index of the employee that you want to update: ");
			pos = sc.nextInt();
			System.out.println("if you want to update the attributes, enter the new value or enter the old value");
			System.out.print("Enter employee name:");
			name = sc.next();
			e[pos].setName(name);
			System.out.print("Enter employee age: \n");
			age = sc.nextInt();
			e[pos].setAge(age);
			System.out.print("Enter employee designation: \n");
			designation = sc.next();
			e[pos].setDesignation(designation);
			System.out.print("Enter employee department: \n");
			department = sc.next();
			e[pos].setDepartment(department);
			System.out.print("Enter employee salary: \n");
			salary = sc.nextDouble();
			e[pos].setSalary(salary);
			l.set(pos, e[pos]);
            break;
        
		case 4:
			System.out.println("enter the index of the employee that you want to display:-");
			pos = sc.nextInt();
			System.out.println(l.get(pos).toString(e[pos]));
			break;
			
		case 5:
            for(i=0; i<l.size(); i++) {
				System.out.println(l.get(i).toString(e[i]));
			}
            break;
        default:
        	System.exit(-1);
			
	}
            System.out.println("Enter 1 to continue? if no enter 0");
            flag = sc.nextInt();
		}while(flag!=0);
		
      
        		
//		System.out.println(e1.toString(e1));
		
		
	}
	}


