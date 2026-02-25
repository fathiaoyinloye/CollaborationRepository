import java.util.List;
import java.util.Objects;

public class User {
    private List<Contact> contactsList;

    public String addContact(
    String name, String email,
    String phoneNumber, String address){
        Contact newContact = new Contact();
        newContact.setName(name);
        newContact.setAddress(address);
        newContact.setEmail(email);
        newContact.setPhoneNumber(phoneNumber);
        contactsList.add(newContact);
        return "Contact "+name+" added.";
    }

    public List<Contact> deleteContact(String phoneNumber){
        contactsList.removeIf(contact -> Objects.equals(contact.getPhoneNumber(), phoneNumber));
        return contactsList;
    }

    public Contact findByPhoneNumber(String phoneNumber) {
        for (Contact contact : contactsList) {
            if (phoneNumber.equals(contact.getPhoneNumber())) return contact;
        }

        throw new IllegalArgumentException();
    }

    public Contact findByName(String name){
        for (Contact contact : contactsList) {
            if (name.equals(contact.getName())) return contact;

        }
       throw new IllegalArgumentException();
    }

    public Contact editContact(String phoneNumber,
                              String newName, String newEmail,
                              String newPhoneNumber, String newAddress){
       Contact contact = findByPhoneNumber(phoneNumber);
       contact.setPhoneNumber(newPhoneNumber);
       contact.setEmail(newEmail);
       contact.setName(newName);
       contact.setAddress(newAddress);
       return contact;
    }
}
