package com.example.coursework2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionNotAmountException extends RuntimeException {
    public QuestionNotAmountException() {
    }

    public QuestionNotAmountException(String message) {
        super(message);
    }

    public QuestionNotAmountException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionNotAmountException(Throwable cause) {
        super(cause);
    }

    public QuestionNotAmountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
