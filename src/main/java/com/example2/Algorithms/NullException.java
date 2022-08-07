package com.example2.Algorithms;

public class NullException extends RuntimeException {
    public NullException() {
    }

    public NullException(String message) {
        super("We cant add null");
    }

    public NullException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullException(Throwable cause) {
        super(cause);
    }

    public NullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
