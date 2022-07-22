/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.djluis.altura_demo.services;

import com.djluis.altura_demo.models.PersonModel;
import com.djluis.altura_demo.repositories.PersonRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;

/**
 *
 * @author Luis Suárez
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Page<PersonModel> index(Pageable pageable) {
        return personRepository.findAll(pageable);
    }

    public PersonModel store(PersonModel person) {
        return personRepository.save(person);
    }

    public Optional<PersonModel> show(Long id) {
        return personRepository.findById(id);
    }

    public boolean delete(Long id) {
        try {
            personRepository.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}