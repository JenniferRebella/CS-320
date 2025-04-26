import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
	//checks to see if the constructor works with the correct information.
	@Test
	void testContactConstructorPass(){
		String iD = "1";
		String firstName = "Jennifer";
		String lastName = "Rebella";
		String number = "3203106965";
		String address = "123 Fake Street";
		Contact testContact = new Contact(iD, firstName, lastName, number, address);
			assertEquals("1", testContact.getId());
			assertEquals(firstName, testContact.getFirstName());
			assertEquals(lastName, testContact.getLastName());
			assertEquals(number, testContact.getNumber());
			assertEquals(address, testContact.getAddress());
	}
	//Checks to see if the constructor will throw an illegal argument
	@Test
	void testContactConstructorFail(){
		String iD = "2";
		String firstName = "S'Chn T'Gai";//first name is to long and will cause an error
		String lastName = "Spock";
		String number = "1231234";//number is not 10 so it should cause an error
		String address = "1234 Vulcan Street";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(iD, firstName, lastName, number, address);
        });;
	}
	//The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. 
	@Test
	void testIdLongerThan() {
		String iD = "12345678910";
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(iD, firstName, lastName, number, address);
        });
	}//The contact ID shall not be null.

	@Test
	void testIdNull() {
		String iD = null;
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(iD, firstName, lastName, number, address);
        });

	}
	//Checks if the test ID passes.

	@Test
	void testIdPass() {
		String iD = "3";
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Contact testContact = new Contact(iD, firstName, lastName, number, address);
		assertEquals("3", testContact.getId());
		assertEquals(firstName, testContact.getFirstName());
		assertEquals(lastName, testContact.getLastName());
		assertEquals(number, testContact.getNumber());
		assertEquals(address, testContact.getAddress());

	}
	//The contact object shall have a required firstName String field that cannot be longer than 10 characters. 

	@Test
	void testFirstNameLongerThan() {
		String iD = "4";
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Contact testContact = new Contact(iD, firstName, lastName, number, address);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName("TypingThingsSoItIsLongerThanAllowed");
        });

	}
//The firstName field shall not be null.
	@Test
	void testFirstNameNull() {
		String iD = "5";
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Contact testContact = new Contact(iD, firstName, lastName, number, address);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName(null);
        });
	}
//Checks if the first name passes.
	@Test
	void testFirstNamePass() {
		String iD = "6";
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Contact testContact = new Contact(iD, firstName, lastName, number, address);
		testContact.setFirstName("Test");        
        assertEquals("Test", testContact.getFirstName());
	}
	//The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.

	@Test
	void testLastnameLongerThan() {
		String iD = "7";
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Contact testContact = new Contact(iD, firstName, lastName, number, address);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName("TypingThingsSoItIsLongerThanAllowed");
        });
	}

	@Test
	void testLastNameNull() {
		String iD = "8";
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Contact testContact = new Contact(iD, firstName, lastName, number, address);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName(null);
        });

	}

	@Test
	void testLastNamePass() {
		String iD = "9";
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Contact testContact = new Contact(iD, firstName, lastName, number, address);
		 testContact.setLastName("Test");        
	     assertEquals("Test", testContact.getLastName());
		}
		
	//The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
	@Test
	void testNumberLongerThan() {
		String iD = "10";
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Contact testContact = new Contact(iD, firstName, lastName, number, address);
		 Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        	testContact.setNumber("123456789101112131415");
	        });
	}
	

	@Test
	void testNumberShorterThan() {
		String iD = "11";
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Contact testContact = new Contact(iD, firstName, lastName, number, address);
		 Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        	testContact.setNumber("1");
	        });
	}
	@Test
	void testNumberNull() {
		String iD = "12";
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Contact testContact = new Contact(iD, firstName, lastName, number, address);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setNumber(null);
			});
	}
	@Test
	void testNumberPass() {
		String iD = "13";
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Contact testContact = new Contact(iD, firstName, lastName, number, address);
        testContact.setNumber("1987654321");        
        assertEquals("1987654321", testContact.getNumber());		
	}
	//The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
	@Test
	void testAddressLongerThan() {
		String iD = "14";
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Contact testContact = new Contact(iD, firstName, lastName, number, address);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress("TypingThingsSoItIsWaaaayyyyLongerThanAllowed");
        });
	}
	@Test
	void testAddressNull() {
		String iD = "15";
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Contact testContact = new Contact(iD, firstName, lastName, number, address);
		 Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        	testContact.setAddress(null);
	        });
	}
	@Test
	void testAddressPass() {
		String iD = "16";
		String firstName = "James";
		String lastName = "Kirk";
		String number = "3201231234";
		String address = "1234 Enterprise Street";
		Contact testContact = new Contact(iD, firstName, lastName, number, address);
        testContact.setAddress("222 Earth Drive");        
        assertEquals("222 Earth Drive", testContact.getAddress());
	}

}
