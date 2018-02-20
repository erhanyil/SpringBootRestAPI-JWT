package com.stdiosoft;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.oauth2.common.exceptions.UnauthorizedClientException;
import org.springframework.security.oauth2.common.exceptions.UnauthorizedUserException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = { IllegalArgumentException.class, IllegalStateException.class })
    protected ResponseEntity<Object> IllegalArgumentException(RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, "IllegalArgumentException", new HttpHeaders(), HttpStatus.CONFLICT, request);
    }
    @ExceptionHandler(value = { UnauthorizedClientException.class, UnauthorizedUserException.class })
    protected ResponseEntity<Object> UnauthorizedClientException(RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, "UnauthorizedClientException", new HttpHeaders(), HttpStatus.CONFLICT, request);
    }
    @ExceptionHandler(value = { AccessDeniedException.class, java.nio.file.AccessDeniedException.class})
    protected ResponseEntity<Object> AccessDeniedException(RuntimeException ex, WebRequest request) {
        return handleExceptionInternal(ex, "AccessDeniedException", new HttpHeaders(), HttpStatus.CONFLICT, request);
    }
}
