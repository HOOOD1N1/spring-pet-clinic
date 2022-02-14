package com.springframework.edypetclinic.repositories;

import com.springframework.edypetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
