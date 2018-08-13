package arrays;

//import com.sun.java_cup.internal.runtime.Scanner;
import java.util.Scanner;



public class Main {

	
	private static Scanner scanner = new java.util.Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone(null, null);
	
	public static void main(String[] args) {
	
		boolean close = false;
		int choice = 0;
		
		
		
		while(!close) {
			System.out.println("\t\t CONTACTS");
			System.out.println("\n\nEnter your choice: \n");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				mobilePhone.printContacts();
				break;
			case 2:
				addContact();
				break;
			case 3:
				modifyContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				searchForContact();
				break;
			case 6:
				System.out.println("Exiting the application");
				close = true;
				break;

			}
		}
		
		
		
		
	}
	
	
	public static void printInstructions() {
		System.out.println("\nPress");
		System.out.println("\t 0 - To Print choice options.");
		System.out.println("\t 1 - To print the list of contacts");
		System.out.println("\t 2 - To add a name to the contact list");
		System.out.println("\t 3 - To modify a contact on the list");
		System.out.println("\t 4 - To remove a contact from the list");
		System.out.println("\t 5 - To search for a contact");
		
		System.out.println("\t 6 - To quit the application");

	}
	
	public static void addContact() {
		System.out.println("Enter contact name: \n");
		String name= scanner.nextLine();
		
		System.out.println("Enter contact number: \n");
		String number= scanner.nextLine();
		
		mobilePhone.addContact(name, number);
	}
	
	public static void modifyContact() {
		System.out.println("Enter contact you want to change: \n");
		String newName = scanner.nextLine();
		System.out.println("Enter the new name: \n");
		String name = scanner.nextLine();
		mobilePhone.modifyContact(name, newName);
	}
	
	public static void removeContact() {
		System.out.println("Enter contact to delete: \n");
		String name = scanner.nextLine();
		mobilePhone.deleteContact(name);
		mobilePhone.printContacts();
		System.out.println("\nDone");
	}
	
	public static void searchForContact() {
		System.out.println("Enter contact name: \n");
		String name = scanner.nextLine();
		mobilePhone.findContact(name);
	}
	
	
	
	///////////////////////////

}

