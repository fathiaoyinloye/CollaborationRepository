package exceptions;

public class ContactAlreadyExistException extends RuntimeException {
    public ContactAlreadyExistException() {
        super("Telephone number already exist");
    }
}
