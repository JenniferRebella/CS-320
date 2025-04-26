public class Contact {
	
	
	private String iD;

	private String firstName;
	
	private String lastName;
	
	private String number;
	
	private String address;
	
	// setting up the contact and its requirements
	public Contact(String iD, String firstName, String lastName, String number, String address) {
	//if the id is null or over 10 characters an illegal argument exception will be thrown
		if(iD == null|| iD.length()>10) {
		
			throw new IllegalArgumentException("Invalid iD");
		}
		//if the first name is null or over 10 characters an illegal argument exception will be thrown
		if(firstName == null|| firstName.length()>10) {
		
			throw new IllegalArgumentException("Invalid firstName");
		}
		//if the last name is null or over 10 characters an illegal argument exception will be thrown
		if(lastName == null || lastName.length()>10) {
		
			throw new IllegalArgumentException("Invalid lastName");
		}
		//if the phone number is null or not 10 characters an illegal argument exception will be thrown
		if(number == null || number.length()!=10) {
		
			throw new IllegalArgumentException("Invalid number");
		}
		//if the address is null or over 30 characters an illegal argument exception will be thrown
		if(address == null|| address.length()>30) {
			
			throw new IllegalArgumentException("Invalid address");
		}
		//sets the approved id, first name, last name, number, and address
		
		this.iD = iD;
		
		this.firstName = firstName;
		
		this.lastName = lastName;
		
		this.number = number;
		
		this.address = address;
	}
	
	//getters and setters
	public String getId() {
	
		return iD;
	}
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public String getLastName() {
	
		return lastName;
	}
	
	public String getNumber() {
	
		return number;
	}
	
	public String getAddress() {
	
		return address;
	}
	
	public void setId(String iD) {
	
		if(iD == null||iD.length()>10) {
	
			throw new IllegalArgumentException("Invalid iD");
		}
		
	}
	
	public void setFirstName(String firstName) {
	
		if(firstName == null|| firstName.length()>10) {
		
			throw new IllegalArgumentException("Invalid firstName");
		}
		
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
	
		if(lastName == null|| lastName.length()>10) {
		
			throw new IllegalArgumentException("Invalid lastName");
		}
		
		this.lastName = lastName;
	}
	
	public void setNumber(String number) {
	
		if(number == null|| number.length()!=10) {
		
			throw new IllegalArgumentException("Invalid number");
		}
		
		this.number = number;
	}
	
	public void setAddress(String address) {
		
		if(address == null|| address.length()>30) {
		
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.address = address;
	}
}
