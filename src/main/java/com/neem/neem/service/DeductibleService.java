package com.neem.neem.service;

import com.neem.neem.model.Deductible;
import com.neem.neem.repository.DeductibleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeductibleService {

    private final DeductibleRepository deductibleRepository;
    private final SubscriberDeductibleService subscriberDeductibleService;


    public Deductible save(Deductible deductible, double delta) {
        //TODO
        subscriberDeductibleService.save(deductible, delta);
        return deductibleRepository.save(deductible);
    }

}
