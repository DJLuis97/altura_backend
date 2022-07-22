/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.djluis.altura_demo.repositories;

import com.djluis.altura_demo.models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Luis Suárez
 */
@Repository
public interface PersonRepository extends JpaRepository<PersonModel, Long> {
    
}