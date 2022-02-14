package com.springframework.edypetclinic.repositories;

import com.springframework.edypetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
