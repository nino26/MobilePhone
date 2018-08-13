package arrays;

import java.util.ArrayList;



public class MobilePhone {

	private String phoneNumber;
	private ArrayList<Contact> contactName;
	
	
	
	

	public MobilePhone(String phoneNumber, ArrayList<String> contactName) {
		this.phoneNumber = phoneNumber;
		this.contactName = new ArrayList<Contact>();
	}
	
	
	public int findContact(String searchName) {
		for(int i=0; i < this.contactName.size();i++) {
			Contact tempContact = this.contactName.get(i);
			if (tempContact.getName().equals(searchName)) {
				return i;
			}
		}
		return -1;
	}
	
	public void addContact(String name, String phoneNumber) {
		int contactID = findContact(name);
		if(contactID<0) {
			Contact tempContact = new Contact(name, phoneNumber);
			this.contactName.add(tempContact);
			System.out.println("Contact "+name+ " created");
		}else {
			System.out.println("Contact already exists");
		}
		
	}
	
	
	public void deleteContact(String name) {
		int contactID = findContact(name);
		if (contactID < 0) {
			System.out.println("Contact doesn't exist");
		}else {
			this.contactName.remove(contactID);
			System.out.println("Contact "+name+" deleted");
		}
	}
	
	
	public void searchName(String name) {
		int contactID = findContact(name);
		if (contactID<0) {
			System.out.println("Name doens't exist");
		}else {
			Contact tempContact = contactName.get(contactID);
			System.out.println("Contact name: "+ tempContact.getName());
			System.out.println("Contact Number " + tempContact.getPhoneNumber());
		}
	}
	
	public void modifyContact(String currentName, String newName) {
		int contactID = findContact(currentName);
		if (contactID<0) {
			System.out.println("Name doesn't exist, add it");
		}else {
			modifyContact(contactID, newName);
		}
	}
	
	private void modifyContact(int contactID, String newName) {
		Contact tempContact = contactName.get(contactID);
		contactName.set(contactID, tempContact);
		
	}
	
	public void printContacts() {
		int contactID;
		for(int i = 0;i< contactName.size();i++) {
			Contact tempContact = this.contactName.get(i);
			contactID = i+1;
			System.out.println("Contact " + contactID);
            System.out.println("Contact name: " + tempContact.getName());
            System.out.println("Contact number: " + tempContact.getPhoneNumber());
		}
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public ArrayList<Contact> getContactName() {
		return contactName;
	}
	
	
	//////////
}
