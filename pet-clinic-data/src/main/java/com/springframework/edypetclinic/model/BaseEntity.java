package com.springframework.edypetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    public Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
