package com.and.playground.demo.controllers;

import com.and.playground.demo.exceptions.NotNumberException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @RequestMapping(value = "sum/{number1}/{number2}", method = RequestMethod.GET)
    public Double sum(@PathVariable("number1") Double number1, @PathVariable("number2") Double number2) {
        if (true) {
            throw new NotNumberException("NotNumberException");
        }
        return number1 + number2;
    }
}
