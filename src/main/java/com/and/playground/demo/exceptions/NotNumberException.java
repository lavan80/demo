package com.and.playground.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE)
public class NotNumberException extends RuntimeException {

    public NotNumberException(String exception) {
        super(exception);
    }
}
