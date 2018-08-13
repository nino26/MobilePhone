package arrays;

import java.util.ArrayList;

public class Contact{
	
	private String name;
	private String phoneNumber;
	
	
	public Contact(String contactName, String contactNumber) {
		if (!contactName.equals(" ")) {
			this.name = name;
			this.phoneNumber = phoneNumber;
		}else {
			System.out.println("Error! write name");
		}
	}


	public String getName() {
		return name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	
}	
	
	
	
	
	
//	
//	public ArrayList<String> getContactName() {
//		return contactName;
//	}
//
//	public ArrayList<String> getContactNumber() {
//		return contactNumber;
//	}
//
//	//add name
//	public void addContactName(String name) {
//		contactName.add(name);
//	}
//	
//	//add number
//	public void addContactNumber(String number) {
//		contactNumber.add(number);
//	}
//	
//	//modify name
//	public void modifyContactName(String currentName, String newName) {
//		int position = findName(currentName);
//		if(position >=0) {
//			modifyContactName(position, newName);
//		}
//		
//	}
//	//modify number
//	public void modifyContactNumber(String currentNumber, String newNumber) {
//		int position = findNumber(currentNumber);
//		if(position >=0) {
//			modifyContactNumber(position, newNumber);
//		}
//		
//	}
//	//private methodoverload
//	private void modifyContactName(int position, String newName) {
//		contactName.set(position, newName);
//		//System.out.println("Grocery item " + (position+1)+ " has been modefied.");
//		System.out.println("Contact " + (position+1)+ " name has been modefied.\n"+"New name is "+ newName);
//		
//	}
//	
//	private void modifyContactNumber(int position, String newNumber) {
//		contactNumber.set(position, newNumber);
//		//System.out.println("Grocery item " + (position+1)+ " has been modefied.");
//		System.out.println("Contact " + (position+1)+ " phone number has been modefied.\n"+"New number is "+ newNumber);
//		
//	}
//	//remove name
//	private void removeContactName(int postion) {
//		contactName.remove(postion);
//	}
//	//remove number
//	private void removeContactNumber(int postion) {
//		contactNumber.remove(postion);
//	}
//	
//	//query for name
//	private int findName(String searchName) {
////		boolean exist = groceryList.contains(searchItem);
//		return contactName.indexOf(searchName);
//	}
//	//query for number
//	private int findNumber(String searchNumber) {
////		boolean exist = groceryList.contains(searchItem);
//		return contactNumber.indexOf(searchNumber);
//	}
//	//if name is not on file return false check if name is in
//	public boolean onFileName(String searchName) {
//		int position = findName(searchName);
//		if(position >=0) {
//			return true;
//		}
//		return false;
//	}
//	
//	//if number is not on file return false check if number is in
//		public boolean onFileNumber(String searchNumber) {
//			int position = findNumber(searchNumber);
//			if(position >=0) {
//				return true;
//			}
//			return false;
//		}
//	
//	
//	
//	
//	
//	////////////
//	
//}