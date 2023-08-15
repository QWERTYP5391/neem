package com.neem.neem.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.UUID;

@Entity
@Getter
public class Deductible {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private DeductibleCategory deductibleCategory;

    @Column(name = "individual_amount", nullable = false)
    private double individualAmount;

    @OneToOne
    @JoinColumn(name = "insurance_plan_id", referencedColumnName = "id")
    private InsurancePlan insurancePlan;

}
