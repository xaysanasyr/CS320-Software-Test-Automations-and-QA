package test;

import normal.Contact;
import normal.ContactService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Tests for the ContactService class to ensure it properly manages contacts
public class ContactServiceTest {

    private ContactService service;

    // Setup method to initialize the ContactService before each test
    @BeforeEach
    public void setUp() {
        service = new ContactService();
    }

    // Test adding a new contact with a unique ID
    @Test
    public void testAddContact() {
        Contact contact = new Contact("1", "Rikki", "X", "1112223334", "2024 Spring Lane");
        service.addContact(contact);
        assertNotNull(service.getContact("1"));
    }

    // Test handling of adding a contact with an existing ID
    @Test
    public void testAddContactWithDuplicateId() {
        Contact contact1 = new Contact("1", "Rikki", "X", "1122334455", "2024 Spring Lane");
        service.addContact(contact1);
        Contact contact2 = new Contact("1", "Ricky", "Z", "1001110011", "2024 Spring St");
        assertThrows(IllegalArgumentException.class, () -> service.addContact(contact2));
    }

    // Test updating an existing contact
    @Test
    public void testUpdateContact() {
        Contact contact = new Contact("1", "Rikki", "X", "1122334455", "2024 Spring Lane");
        service.addContact(contact);
        service.updateContact("1", "Ricky", "Z", "2220003339", "2024 Sweet Circle");
        Contact updatedContact = service.getContact("1");
        assertEquals("Ricky", updatedContact.getFirstName());
        assertEquals("Z", updatedContact.getLastName());
        assertEquals("2220003339", updatedContact.getPhone());
        assertEquals("2024 Sweet Circle", updatedContact.getAddress());
    }

    // Test deleting an existing contact
    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("1", "Rikki", "X", "1234567890", "2024 Spring St");
        service.addContact(contact);
        service.deleteContact("1");
        assertNull(service.getContact("1"));
    }
}
