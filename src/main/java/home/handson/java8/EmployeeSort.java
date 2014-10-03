package home.handson.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

class Employee {

	private int empId;
	private String lastName;
	private String firstName;

	public Employee() {
	}

	public Employee(int empId, String lastName, String firstName) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;

	}

	// setters and getters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int compareByLastName(Employee x, Employee y) {
		return x.getLastName().compareTo(y.getLastName());
	}

	/**
	 * 
	 * public static int compareByLastName(Employee x, Employee y) { return
	 * x.getLastName().compareTo(y.getLastName()); }
	 */
}

public class EmployeeSort {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Smith", "John");
		Employee e2 = new Employee(2, "Bloggs", "Joe");
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);

		// Java 7
//		Collections.sort(list, new Comparator<Employee>() {
//			public int compare(Employee x, Employee y) {
//				return x.getLastName().compareTo(y.getLastName());
//			}
//		});
		
		
		// Java 8
		Collections.sort(list, (x, y) -> x.getLastName().compareTo(y.getLastName()));
		ListIterator<Employee> litr = list.listIterator();

		while (litr.hasNext()) {
			Employee element = litr.next();
			System.out.print(element.getLastName() + " ");
		}

	}
}
