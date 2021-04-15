package by.epamtc.exercise7.exception;

public class NullPointExceptionException extends Exception {

    public NullPointExceptionException() {
    }

    public NullPointExceptionException(String message) {
        super(message);
    }

    public NullPointExceptionException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullPointExceptionException(Throwable cause) {
        super(cause);
    }

}

