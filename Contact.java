package normal;

// The Contact class defines a structure for storing contact information.
// It enforces constraints on various fields to ensure data validity.
public class Contact {
    
    // Fields defined with specific validation requirements
    private final String contactId;   // Unique and immutable identifier, max 10 chars, not null
    private String firstName;         // First name, max 10 chars, not null
    private String lastName;          // Last name, max 10 chars, not null
    private String phone;             // Phone number, exactly 10 digits, not null
    private String address;           // Address, max 30 chars, not null

    // Constructor for Contact, throws IllegalArgumentException if input does not meet requirements
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID");
        }
        this.contactId = contactId;
        
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setAddress(address);
    }

    // Setter for firstName, validates the input
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;
    }

    // Setter for lastName, validates the input
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;
    }

    // Setter for phone, validates the input
    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone = phone;
    }

    // Setter for address, validates the input
    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }

    // Getters for all fields
    public String getContactId() { return contactId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
}
