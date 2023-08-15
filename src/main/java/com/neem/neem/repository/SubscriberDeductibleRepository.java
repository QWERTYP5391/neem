package com.neem.neem.repository;


import com.neem.neem.model.SubscriberDeductible;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SubscriberDeductibleRepository extends CrudRepository<SubscriberDeductible, UUID> {
    SubscriberDeductible findBySubscriptionId(UUID id);
}
