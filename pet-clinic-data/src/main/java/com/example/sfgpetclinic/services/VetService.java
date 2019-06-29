package com.example.sfgpetclinic.services;

import com.example.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet Save(Vet owner);

    Vet findById(Long id);

    Set<Vet> findAll();
}
