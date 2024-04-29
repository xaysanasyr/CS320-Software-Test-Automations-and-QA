
public class Contact {
	//Contact Class Requirements
	private final String contactID; // Unique, non-null, max 10 chars
    private String firstName; // Non-null, max 10 chars
    private String lastName; // Non-null, max 10 chars
    private String phone; // Exactly 10 digits
    private String address; // Non-null, max 30 chars

    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Getters
    public String getContactID() { return contactID; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

}

