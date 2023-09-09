package com.andreas.handla.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Meal {

    @Id
    @GeneratedValue
    private Long id;

    public void setId(Long id) { this.id = id;}

    public Long getId() { return id; }

    private String name;
    private String description;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}
