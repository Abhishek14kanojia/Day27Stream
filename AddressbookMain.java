package com.day27AddressBook;

import java.util.Scanner;

public class AddressbookMain {

	public static void main(String[] args) {

		MultipleAddressbook mm = new MultipleAddressbook();
		while(true) {
			System.out.println("Enter \\n 1. To add the new AddressBook\\n 2. To add contact in AddressBook\\n \"\r\n"
					+ " + \"3. To edit the contact in AddressBook\\n 4. To delete the contact in AddressBook\\n 5. To delete the AddressBook\\n \"\r\n"
					+ " + \"6. To Print the AddressBook\\n 7. To Print the contacts in AddressBook\\n 0. To exit");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				mm.addAddressbook();
				break;
			case 2:
				mm.addContact();
				break;
			case 3:
				mm.editContactInBook();
				break;
			case 4:
				mm.deleteContactInBook();
				break;
			case 5:
				mm.deleteAddressBook();
				break;
			case 6:
				mm.printBook();
				break;
			case 7:
				mm.printContactsInBook();
				break;
			case 8:
				System.exit(0);
				default: 
					System.out.println("Error wrong input ");
			}
			 
		}
		
	
	}

}
