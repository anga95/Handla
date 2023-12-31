package com.andreas.handla.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;


    public void setId(Long id) { this.id = id;}
    public Long getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }


}
