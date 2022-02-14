package com.springframework.edypetclinic.repositories;

import com.springframework.edypetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
