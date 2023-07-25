package com.example.utp.Controller;

import com.example.utp.Config.ServerResponse;
import com.example.utp.Util.NullException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NullException.class)
    public ServerResponse NullException(Exception e) {
        return ServerResponse.ERROR(e.getMessage());
    }
}

