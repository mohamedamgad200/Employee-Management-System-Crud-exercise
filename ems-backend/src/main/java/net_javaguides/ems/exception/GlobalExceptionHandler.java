package net_javaguides.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionResponse>handleException(Exception ex){
        return new ResponseEntity<ExceptionResponse>(new ExceptionResponse(ex.getMessage(),ex.getClass().getSimpleName()),HttpStatus.NOT_FOUND);
    }
}
