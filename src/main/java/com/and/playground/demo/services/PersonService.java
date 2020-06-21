package com.and.playground.demo.services;

import com.and.playground.demo.entity.Person;
import com.and.playground.demo.exceptions.NotFoundUserException;
import com.and.playground.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person findById(long id) {
        return personRepository.findById(id).orElseThrow(() -> new NotFoundUserException("User doesn't exists"));
    }

    public Person save(Person person){
        return personRepository.save(person);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person update(Person person) {
        Person entity = findById(person.getId());

        entity.setFirstName(person.getFirstName());

        return entity;
    }
}
