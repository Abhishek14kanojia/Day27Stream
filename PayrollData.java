package com.day27AddressBook;

public class PayrollData {

	int id;
	String name;
	double salary;
	public PayrollData(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "PayrollData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
