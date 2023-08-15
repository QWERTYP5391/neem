package com.neem.neem.controller;

import com.neem.neem.model.Deductible;
import com.neem.neem.model.request.UpdateDeductibleRequest;
import com.neem.neem.service.DeductibleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeductibleController {

    private final DeductibleService deductibleService;


    @PutMapping("/update")
    public ResponseEntity<Deductible> update(UpdateDeductibleRequest updateDeductibleRequest) {
        return ResponseEntity.ok(deductibleService.save(updateDeductibleRequest.getDeductible(),
                updateDeductibleRequest.getDeductibleAmountDelta()));
    }
}
