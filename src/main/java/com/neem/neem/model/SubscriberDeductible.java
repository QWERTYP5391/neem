package com.neem.neem.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class SubscriberDeductible {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "subscribtion_id", referencedColumnName = "id")
    private Subscription subscribtion;

    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private DeductibleCategory deductibleCategory;


    @Column(name = "remaining_deductible", nullable = false)
    private double remainingDeductible;
}
