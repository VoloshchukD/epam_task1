package by.epamtc.exercise3.exception;

public class InvalidSquareValueException extends Exception {

    public InvalidSquareValueException() {
    }

    public InvalidSquareValueException(String message) {
        super(message);
    }

    public InvalidSquareValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSquareValueException(Throwable cause) {
        super(cause);
    }

}

