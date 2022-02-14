package com.springframework.edypetclinic.repositories;

import com.springframework.edypetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
