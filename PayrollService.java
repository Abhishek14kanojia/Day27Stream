package com.day27AddressBook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayrollService {
	public enum IOService{
        COONSOLE_IO, FILE_IO, DB_IO, REST_IO

	};
	List<PayrollData> employeePayrollLIst;
	public PayrollService(List<PayrollData> employeePayrollLIst) {
		super();
		this.employeePayrollLIst = employeePayrollLIst;
	}
	
	public static void main(String[] args) {
		ArrayList<PayrollData> payrollList = new ArrayList<>();
		PayrollService payrollservice = new PayrollService(payrollList);
		Scanner sc = new Scanner(System.in);
		payrollservice.readPayrollData(sc);
		payrollservice.writePayrollData();
	}

	private void writePayrollData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID Number : ");
		int id = sc.nextInt();
		System.out.println("Enter Name of Employee : ");
		String name = sc.next();
		System.out.println("Enter the Salary : ");
		double salary = sc.nextDouble();
		employeePayrollLIst.add((new PayrollData(id, name, salary)));
	}

	private void readPayrollData(Scanner sc) {
		System.out.println(employeePayrollLIst);
		
	}
	
	
	
}