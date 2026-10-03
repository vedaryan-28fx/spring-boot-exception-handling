package com.ved.ExceptionHandling.controllers;

import com.ved.ExceptionHandling.exceptions.CustomException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/divide/{a}divideBy{b}")
    public int divide(@PathVariable int a,@PathVariable int b){
        return a / b;
    }

    @GetMapping("/custom")
    public String custom(){
        throw new CustomException("This is a Custom Exception");
    }
}
