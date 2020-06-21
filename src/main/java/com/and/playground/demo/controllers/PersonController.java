package com.and.playground.demo.controllers;

import com.and.playground.demo.entity.Person;
import com.and.playground.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping(value = "save", produces = {"application/json", "application/xml"} ,
            consumes = {"application/json", "application/xml"})
    public Person save(@RequestBody Person person) {
        return personService.save(person);
    }

    @PutMapping(value = "update")
    public Person update(@RequestBody Person person) {
        return personService.update(person);
    }

    @GetMapping(produces = {"application/json", "application/xml"})
    public List<Person> findAll() {
        return personService.findAll();
    }
}
