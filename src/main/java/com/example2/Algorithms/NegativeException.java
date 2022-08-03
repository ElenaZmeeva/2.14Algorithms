package com.example2.Algorithms;

public class NegativeException extends RuntimeException {
    public NegativeException() {
    }

    public NegativeException(String message) {
        super("Index cannot be negative");
    }

    public NegativeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeException(Throwable cause) {
        super(cause);
    }

    public NegativeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
