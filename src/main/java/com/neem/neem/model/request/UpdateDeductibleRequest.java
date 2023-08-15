package com.neem.neem.model.request;

import com.neem.neem.model.Deductible;
import lombok.Getter;

@Getter
public class UpdateDeductibleRequest {

    private Deductible deductible;

    private double deductibleAmountDelta;
}
