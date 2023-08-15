package com.neem.neem.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Date;
import java.util.UUID;


@Entity
@Getter
public class Subscription {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "insurance_plan_id", referencedColumnName = "id")
    private InsurancePlan insurancePlan;


    @OneToOne
    @JoinColumn(name = "subscriber_id", referencedColumnName = "id")
    private Subscriber subscriberId;

    @OneToOne
    @JoinColumn(name = "employer_id", referencedColumnName = "id")
    private Employer employerId;


    @Column(name = "status", nullable = false)
    private SubscriptionStatus subscriptionStatus;

    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "end_date", nullable = false)
    private Date endDate;


}

