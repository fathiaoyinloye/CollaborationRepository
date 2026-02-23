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

    public String deleteContact(String phoneNumber){
        contactsList.removeIf(contact -> Objects.equals(contact.getPhoneNumber(), phoneNumber));
        return "Contact has been deleted";
    }

    public Contact findByPhoneNumber(String phoneNumber) {
        for (Contact contact : contactsList) {
            if (Objects.equals(phoneNumber, contact.getPhoneNumber())) return contact;

        }

        return null;
    }

    public Contact findByName(String name){
        for (Contact contact : contactsList) {
            if (Objects.equals(name, contact.getName())) return contact;
            else throw new IllegalArgumentException("WRONG");
        }
        return null;
    }

    public String editContact(String phoneNumber,
                              String newName, String newEmail,
                              String newPhoneNumber, String newAddress){
       Contact contact = findByPhoneNumber(phoneNumber);
       contact.setPhoneNumber(newPhoneNumber);
       contact.setEmail(newEmail);
       contact.setName(newName);
       contact.setAddress(newAddress);
       return "Contact Edited Successfully";
    }
}
