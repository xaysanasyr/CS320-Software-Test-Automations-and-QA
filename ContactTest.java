package test;

import normal.Contact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Tests for the Contact class to ensure all field validations are enforced properly.
public class ContactTest {

    // Test to ensure contact ID is not too long and not null
    @Test
    public void testContactIdConstraints() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "Beef", "Jerky", "1234567890", "2024 Buccee Lane"));
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Beef", "Jerky", "1234567890", "2024 Buccee Lane"));
    }

    // Test to ensure first name is not too long and not null
    @Test
    public void testFirstNameConstraints() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Beeeeeeeeef", "Jerky", "1234567890", "2024 Buccee Lane"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", null, "Jerky", "1234567890", "2024 Buccee Lane"));
    }

    // Test to ensure last name is not too long and not null
    @Test
    public void testLastNameConstraints() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Beef", "Jerkyyyyyyy", "1234567890", "2024 Buccee Lane"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Beef", null, "1234567890", "2024 Buccee Lane"));
    }

    // Test to ensure phone number is exactly 10 digits and not null
    @Test
    public void testPhoneConstraints() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Jane", "Doe", "12345678901", "123 Main St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Jane", "Doe", null, "123 Main St"));
    }

    // Test to ensure address is not too long and not null
    @Test
    public void testAddressConstraints() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Jane", "Doe", "1234567890", "123 Main Street Anytown, Anystate"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Jane", "Doe", "1234567890", null));
    }
}
