package com.springframework.edypetclinic.repositories;

import com.springframework.edypetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
