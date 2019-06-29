package com.example.sfgpetclinic.services;

import com.example.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet Save(Pet owner);

    Pet findById(Long id);

    Set<Pet> findAll();
}
