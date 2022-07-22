/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.djluis.altura_demo.controllers;

import com.djluis.altura_demo.models.PersonModel;
import com.djluis.altura_demo.services.PersonService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Luis Suárez
 */
@RestController
@RequestMapping("/api/person")
@CrossOrigin(origins = "http://localhost:9090")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping
    public Page<PersonModel> index(@PageableDefault(size=25, page=0) Pageable pageable) {
        return personService.index(pageable);
    }

    @GetMapping(path = "/{id}")
    public Optional<PersonModel> show(@PathVariable("id") Long id) {
        return personService.show(id);
    }

    @PostMapping(consumes = {"application/json"})
    public PersonModel store(@RequestBody PersonModel person) {
        return personService.store(person);
    }

    @DeleteMapping(path = "/{id}")
    public String delete(@PathVariable("id") Long id) {
        if (personService.delete(id)) {
            return "Persona borrada con éxito";
        } else {
            return "Algo inesperado pasó al eliminar la persona " + id;
        }
    }
}
