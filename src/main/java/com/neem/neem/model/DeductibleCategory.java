package com.neem.neem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class DeductibleCategory {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "category", nullable = false)
    private String category;

}
