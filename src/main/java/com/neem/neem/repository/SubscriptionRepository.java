package com.neem.neem.repository;

import com.neem.neem.model.Subscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.UUID;

@Repository
public interface SubscriptionRepository extends CrudRepository<Subscription, UUID> {
    Collection<Subscription> findByInsurancePlan(UUID id);

}
