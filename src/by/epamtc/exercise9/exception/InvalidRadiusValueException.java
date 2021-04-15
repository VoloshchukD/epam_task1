package by.epamtc.exercise9.exception;

public class InvalidRadiusValueException extends Exception {

    public InvalidRadiusValueException() {
    }

    public InvalidRadiusValueException(String message) {
        super(message);
    }

    public InvalidRadiusValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidRadiusValueException(Throwable cause) {
        super(cause);
    }

}
