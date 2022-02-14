package com.springframework.edypetclinic.repositories;

import com.springframework.edypetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
