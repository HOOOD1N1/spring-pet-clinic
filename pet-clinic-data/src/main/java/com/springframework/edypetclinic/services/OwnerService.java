package com.springframework.edypetclinic.services;

import com.springframework.edypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

}
