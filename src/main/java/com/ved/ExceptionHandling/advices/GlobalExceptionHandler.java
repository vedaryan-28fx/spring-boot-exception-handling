package com.ved.ExceptionHandling.advices;

import org.springframework.ui.Model;
import com.ved.ExceptionHandling.exceptions.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler({ArithmeticException.class, NullPointerException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleMultipleExceptions(Exception ex, Model model) {
        String message = "An error occurred: " + ex.getMessage();
        model.addAttribute("errorMessage",message);
        return "400.html";
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(CustomException.class)
    public String handleCustomException(CustomException ex, Model model) {
        String message = "An error occurred: " + ex.getMessage();
        model.addAttribute("errorMessage",message);
        return "400.html";
    }
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public String handleInternalServerError(Exception ex, Model model) {
        String message = "An error occurred: " + ex.getMessage();
        model.addAttribute("errorMessage",message);
        return "500.html";
    }
}
