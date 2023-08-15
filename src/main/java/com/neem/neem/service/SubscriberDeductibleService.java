package com.neem.neem.service;

import com.neem.neem.model.Deductible;
import com.neem.neem.model.SubscriberDeductible;
import com.neem.neem.model.Subscription;
import com.neem.neem.repository.SubscriberDeductibleRepository;
import com.neem.neem.repository.SubscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubscriberDeductibleService {

    private final SubscriberDeductibleRepository subscriberDeductibleRepository;
    private final SubscriptionRepository subscriberRepository;

    public void save(Deductible deductible, double delta) {
        List<SubscriberDeductible> entities = new ArrayList<>();
        final Collection<Subscription> subscriptionByInsurancePlan = subscriberRepository.findByInsurancePlan(deductible.getInsurancePlan().getId());

        for (Subscription subscription : subscriptionByInsurancePlan) {
            final SubscriberDeductible subscriberDeductible = subscriberDeductibleRepository.findBySubscriptionId(subscription.getId());
            final double remainingDeductible = subscriberDeductible.getRemainingDeductible() + delta < 0 ? 0 : subscriberDeductible.getRemainingDeductible() + delta;
            subscriberDeductible.setRemainingDeductible(remainingDeductible);
            entities.add(subscriberDeductible);

        }


        subscriberDeductibleRepository.saveAll(entities);


    }
}
