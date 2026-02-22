package exceptions;

public class EmptyInputException extends ContactException{
    public EmptyInputException(){
        super("Input cannot be empty");
    }
}
