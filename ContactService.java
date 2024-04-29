public class ContactService {
	//Method to add new contact to service
    public void addContact(Contact contact) {
        if (contact == null || contacts.containsKey(contact.getContactID()))
        contacts.put(contact.getContactID(), contact);
    }
    //Method to delete contact from service with contactID
    public void deleteContact(String contactID) {
        contacts.remove(contactID);
    }
    //Method to update an exisiting contact information
    public void updateContact(String contactID, String firstName, String lastName, String phone, String address) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            if (firstName != null) contact.setFirstName(firstName);
            if (lastName != null) contact.setLastName(lastName);
            if (phone != null) contact.setPhone(phone);
            if (address != null) contact.setAddress(address);
        }
    }
        