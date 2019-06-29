package com.example.sfgpetclinic.services;

import com.example.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);
    Owner Save(Owner owner);
    Owner findByLastName(String lastName);
    Set<Owner> findAll();

}
