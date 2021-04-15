package by.epamtc.exercise2.exception;

public class NullMonthTypeException extends Exception {

    public NullMonthTypeException() {
    }

    public NullMonthTypeException(String message) {
        super(message);
    }

    public NullMonthTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullMonthTypeException(Throwable cause) {
        super(cause);
    }

}

