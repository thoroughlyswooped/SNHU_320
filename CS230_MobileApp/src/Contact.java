import javax.validation.Constraint;
import javax.validation.constraints.*;

public class Contact {
	@NotNull
	@Size(min=1, max=10, message="ID must not be empty and at most 10 characters" )
	String firstName;
	
	@NotNull
	@Size(min=1, max=10, message="ID must not be empty and at most 10 characters" )
	String lastName;
	
	@NotNull
	@Size(min=10, max=10, message="Number must be exactly 10 digits" )
	String number;
	
	@NotNull
	@Size(min=1, max=30, message="ID must not be empty and at most 10 characters" )
	String address;
	
	
	@NotNull
	@Size(min=1, max=10, message="ID must not be empty and at most 10 characters" ) 
	String id;
	
	// Hide default constructor so no empty Contacts are made
	private Contact(String id) {
	}
	
	public  Contact(String id, String firstName, String lastName, String number, String address) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.address = address;
	}
	
	public void setFirstName(String name){
		firstName = name;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String name){
		lastName = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setNumber(String num){
		number = num;
	}
	
	public String getNumber() {
		return number;
	}
	
	
	public void setAddress(String addr){
		address = addr;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getID() {
		return id;
	}
}
