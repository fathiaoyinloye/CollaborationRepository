import java.util.ArrayList;

public class User {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private String name;

    public void addContact(String firstName, String lastName, String phoneNumber, String address, String email){
        Contact contact = new Contact();
        contact.setName(firstName,lastName);
        contact.setPhoneNumber(phoneNumber);
        contact.setAddress(address);
        contact.setEmail(email);
        contacts.add(contact);
    }

    public void removeContact(String name){
        for(Contact contact : contacts){
            if (contact.getName() == name){
                contacts.remove(contact);
            }
        }
    }

    public Contact findByPhoneNumber(String phoneNumber){
        for(Contact contact : contacts){
            if(contact.getPhoneNumber() == phoneNumber){
                return contact;
            }
        }

        return null;
    }

    public Contact findByFirstName(String firstName){
        for(Contact contact : contacts){
            String[] names = contact.getNames();
            if(names[0] == firstName){
                return contact;
            }
        }
        return null;
    }

    public Contact findByLastName(String lastName){
        for(Contact contact : contacts){
            String[] names = contact.getNames();
            if(names[1] == lastName){
                return contact;
            }
        }
        return null;
    }
    
}
