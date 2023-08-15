package com.neem.neem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employer {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;


}
