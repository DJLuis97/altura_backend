/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.djluis.altura_demo.repositories;

import com.djluis.altura_demo.models.PersonModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Luis Suárez
 */
@Repository
public interface PersonRepository extends CrudRepository<PersonModel, Long> {
    
}
