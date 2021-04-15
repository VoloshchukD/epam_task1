package by.epamtc.exercise2.exception;

public class InvalidMonthValueException extends Exception {

    public InvalidMonthValueException() {
    }

    public InvalidMonthValueException(String message) {
        super(message);
    }

    public InvalidMonthValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidMonthValueException(Throwable cause) {
        super(cause);
    }

}
