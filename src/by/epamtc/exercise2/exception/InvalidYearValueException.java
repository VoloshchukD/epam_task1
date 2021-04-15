package by.epamtc.exercise2.exception;

public class InvalidYearValueException extends Exception {

    public InvalidYearValueException() {
    }

    public InvalidYearValueException(String message) {
        super(message);
    }

    public InvalidYearValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidYearValueException(Throwable cause) {
        super(cause);
    }

}
