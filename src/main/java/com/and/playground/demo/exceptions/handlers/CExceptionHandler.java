package com.and.playground.demo.exceptions.handlers;

import com.and.playground.demo.exceptions.MessageException;
import com.and.playground.demo.exceptions.NotFoundUserException;
import com.and.playground.demo.exceptions.NotNumberException;
import org.joda.time.LocalDateTime;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<MessageException> handleAllException(Exception exc, WebRequest webRequest) {
        MessageException messageException = new MessageException(LocalDateTime.now().toString(),
                exc.getMessage(),
                webRequest.getDescription(false));
        return new ResponseEntity<>(messageException, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NotNumberException.class)
    public final ResponseEntity<MessageException> notNumberException(Exception exc, WebRequest webRequest) {
        MessageException abstractException = new MessageException(LocalDateTime.now().toString(),
                exc.getMessage(),
                webRequest.getDescription(false));

        return new ResponseEntity<>(abstractException, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(NotFoundUserException.class)
    public final ResponseEntity<MessageException> notFoundUserException(Exception exc, WebRequest webRequest) {
        MessageException abstractException = new MessageException(LocalDateTime.now().toString(),
                exc.getMessage(),
                webRequest.getDescription(false));
        return new ResponseEntity<>(abstractException, HttpStatus.NOT_FOUND);
    }

    /*@Override
    protected ResponseEntity<Object> handleHttpMediaTypeNotAcceptable(HttpMediaTypeNotAcceptableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return super.handleHttpMediaTypeNotAcceptable(ex, headers, status, request);
    }*/
}
