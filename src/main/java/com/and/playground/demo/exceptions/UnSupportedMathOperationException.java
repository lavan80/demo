package com.and.playground.demo.exceptions;

import org.joda.time.DateTime;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnSupportedMathOperationException extends RuntimeException {
}
