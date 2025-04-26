import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;




import static org.junit.jupiter.api.Assertions.*;
class ContactServiceTest {
	@Test
	void testAddContact(){
		//tests to see if the contact can be added to the list with their would id's  
		ContactService contactService = new ContactService();
		Assertions.assertTrue(contactService.addContact(new Contact("17","James", "Krik", "3201231234", "1234 Enterprise Street")));
		
	}

	

	@Test
	void testDeleteContact() {
		//tests to see if the contact is deleted from the list by id
		ContactService contactService = new ContactService();
		contactService.addContact(new Contact("18","James", "Krik", "3201231234", "1234 Enterprise Street"));
		Assertions.assertTrue(contactService.deleteContact("18"));
		
	}
	//updating contacts
	//firstName

	@Test
	void testUpdateContactFirstName() {
		//tests to see if the first name is updated by id
		ContactService contactService = new ContactService();
		contactService.addContact(new Contact("19","James", "Krik", "3201231234", "1234 Enterprise Street"));
		contactService.updateContactFirstName("19", "John");
		Assert.assertEquals("John",contactService.getContact("19").getFirstName());
	}
	//lastName
	@Test
	void testUpdateContactLastName() {
		//tests to see if the last name is updated by id
		ContactService contactService = new ContactService();
		contactService.addContact(new Contact("20","James", "Krik", "3201231234", "1234 Enterprise Street"));
		contactService.updateContactLastName("20", "Doe");
		assertEquals("Doe",contactService.getContact("20").getLastName());
	}

	//Number
	@Test
	void testUpdateContactNumber() {
		//tests to see if the phone number is updated by id
		ContactService contactService = new ContactService();
		contactService.addContact(new Contact("21","James", "Krik", "3201231234", "1234 Enterprise Street"));
		contactService.updateContactNumber("21", "4075578779");
		assertEquals("4075578779",contactService.getContact("21").getNumber());
	}
	//Address
	@Test
	void testUpdateContactAddress() {
		//tests to see if address is updated by id
		ContactService contactService = new ContactService();
		contactService.addContact(new Contact("22","James", "Krik", "3201231234", "1234 Enterprise Street"));
		contactService.updateContactAddress("22", "177 Earth Drive");
		assertEquals("177 Earth Drive",contactService.getContact("22").getAddress());
	}

}


