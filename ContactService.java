package normal;

import java.util.HashMap;
import java.util.Map;

// The ContactService class manages a collection of Contact objects.
// It provides methods to add, update, and delete contacts by their unique IDs.
public class ContactService {
    
    // A map to store contacts using their unique IDs as keys.
    private Map<String, Contact> contacts = new HashMap<>();

    // Adds a new contact ensuring the ID is unique.
    // Throws IllegalArgumentException if the contact is null or the ID already exists.
    public void addContact(Contact contact) {
        if (contact == null || contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact is null or already exists.");
        }
        contacts.put(contact.getContactId(), contact);
    }

    // Deletes a contact by its ID.
    // Throws IllegalArgumentException if the contact ID does not exist.
    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID does not exist.");
        }
        contacts.remove(contactId);
    }

    // Updates existing contact fields by contact ID.
    // Throws IllegalArgumentException if the contact ID does not exist.
    public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact contact = contacts.get(contactId);
        if (contact == null) {
            throw new IllegalArgumentException("Contact does not exist.");
        }
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhone(phone);
        contact.setAddress(address);
    }

    // Retrieves a contact by ID, returns null if the contact does not exist.
    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}
