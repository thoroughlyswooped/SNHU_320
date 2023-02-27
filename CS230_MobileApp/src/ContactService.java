import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ContactService {

	List<Contact> contacts = new ArrayList<Contact>();
	
	public Contact addContact(String id, String firstName, String lastName, String number, String address) {
		Contact contact = getContact(id);
		if(contact == null) {
			contact = new Contact(id, firstName, lastName, number, address);
			contacts.add(contact);
			return contact;
		}
		
		return contact;
	}
	
	/*
	 * Get a contact by id
	 * @param id of contact to delete
	 * @return returns deleted Contact if it was found or null if no matching contact was found
	 */
	public Contact deleteContact(String id) {
		Contact contact = getContact(id);
		if(contact == null) {
			return null;
		}
		
		contacts.remove(contact);
		return contact;
	}
	
	
	/*
	 * Get a contact by id
	 * @param id of contact to find
	 * @return returns Contact if it exists or null if it doesn't
	 */
	public Contact getContact(String id) {
		// get contact if it exists
		Iterator<Contact> it = contacts.iterator();
		
		while (it.hasNext()) {
			Contact next = it.next();
			if(next.getID() == id) {
				return next;
			}
		}
		
		// return null if no contact was found
		return null;
	}
	
	
	public Contact updateFirstName(String id, String firstName) {
		Contact contact = getContact(id);
		if (contact == null) {
			return null;
		}
		
		contact.setFirstName(firstName);
		return contact;
	}
	public Contact updateLastName(String id, String lastName) {
		Contact contact = getContact(id);
		if (contact == null) {
			return null;
		}
		
		contact.setLastName(lastName);
		return contact;
	}
	public Contact updateNumber(String id, String number) {
		Contact contact = getContact(id);
		if (contact == null) {
			return null;
		}
		
		contact.setNumber(number);
		return contact;
	}
	public Contact updateAddress(String id, String address) {
		Contact contact = getContact(id);
		if (contact == null) {
			return null;
		}
		
		contact.setAddress(address);
		return contact;
	}
}
