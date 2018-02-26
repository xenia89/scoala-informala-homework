package hangman;

public class SameLetterException extends Exception {
    public SameLetterException(String message){
        super(message);
    }
}
