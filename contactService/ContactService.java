import java.util.ArrayList;

public class ContactService {
	//array list to hold the contacts
	private ArrayList<Contact> list;
	public ContactService() {
		list = new ArrayList<>();
	}
	//gets the contact from the list and returns it or null if not found by searching the id
	public Contact getContact(String iD) {
		for (Contact c : list) {
			if(c.getId().equalsIgnoreCase(iD)) {
				return c;
			}
		}
		return null;
	}
	//Adds the contact if the list size is zero or if the id is not a duplicate and will return
	//true if add or false if it was not added
	//if a id is a duplicate an illegal argument exception will be thrown
	public boolean addContact(Contact contact) {
		
		boolean didAdd = false;
		if(list.size()==0) {
			list.add(contact);
			didAdd = true;
		}
		else {
			for(Contact c : list) {
				if(contact.getId().equalsIgnoreCase(c.getId())) {
					throw new IllegalArgumentException("Duplicate ID");
					}
				}
			list.add(contact);
			didAdd = true;
			}
		return didAdd;
		}
	//deletes the contact based on searching the list for the id
	// if the contact is deleted it will return true 
	//else it will return false
	
	public boolean deleteContact(String iD) {
		for (Contact c : list) {
			if(iD.equalsIgnoreCase(c.getId())){
				list.remove(c);
				return true;
			}
		}
		return false;
	}
	//updates the first name by searching the list for the id
	//if the first name is updated it will return true 
	//else it will return false
	
	public boolean updateContactFirstName( String iD, String updatedFirstName) {
		for(Contact c : list) {
			if(iD.equalsIgnoreCase(c.getId())){
				c.setFirstName(updatedFirstName);
				return true;
			}
		}
		return false;

	}
	//updates the last name by searching the list for the id
	//if the last name is updated it will return true 
	//else it will return false
	
	public boolean updateContactLastName( String iD, String updatedLastName) {
		for(Contact c : list) {
			if(iD.equalsIgnoreCase(c.getId())){
				c.setLastName(updatedLastName);
				return true;
			}
		}
		return false;

	}
	//updates the phone number by searching the list for the id
	//if the phone number is updated it will return true 
	//else it will return false
	
	public boolean updateContactNumber( String iD, String updatedNumber) {
		for(Contact c : list) {
			if(iD.equalsIgnoreCase(c.getId())){
				c.setNumber(updatedNumber);
				return true;

			}
		}
		return false;

	}
	//updates the address by searching the list for the id
	// if the address is updated it will return true 
	//else it will return false
	
	public boolean updateContactAddress( String iD, String updatedAddress) {
		for(Contact c : list) {
			if(iD.equalsIgnoreCase(c.getId())){
				c.setAddress(updatedAddress);
				return true;

			}
		}
		return false;
	}
}

