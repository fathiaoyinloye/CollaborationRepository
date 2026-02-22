import exceptions.ContactAlreadyExistException;
import exceptions.EmptyInputException;

import java.util.ArrayList;

public class User {
    private  String name;
    private ArrayList<Contact> contacts = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact addContact(String name, String telephone, String address, String email){
        validateEmptyInput(name);
        validateEmptyInput(telephone);
        validateTelephone(telephone);
        Contact contact = new Contact(name, telephone);
        contact.setEmail(email);
        contact.setAddress(address);
        contacts.add(contact);
        return contact;
    }


    private void validateEmptyInput(String input){
        if(input.isEmpty()) throw new EmptyInputException();
    }
    private void validateTelephone(String telephone){
        if(findContactByPhonNumber(telephone) != null) throw new ContactAlreadyExistException();
    }


    public  void removeContact(String telephone){
        Contact contact = findContactByPhonNumber(telephone);
        if (contacts != null)contacts.remove(contact);
    }

    public Contact findContactByPhonNumber(String telephone){
        for(Contact contact : contacts){
            if (contact.getTelephone().equals(telephone)) return contact;
        }
        return  null;

    }

    public Contact findContactByName(String name){
        for(Contact contact : contacts){
            if (contact.getTelephone().equals(name)) return contact;
        }
        return  null;

    }

    public Contact editContact(String phonenumber, String newPhoneNumber){
        Contact contact = findContactByPhonNumber(phonenumber);
        if (contacts != null){
            contacts.remove(contact);
            contact.setTelephone(newPhoneNumber);
            contacts.add(contact);
            return contact;
        }
        return null;
    }


}
