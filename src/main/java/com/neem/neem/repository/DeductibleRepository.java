package com.neem.neem.repository;

import com.neem.neem.model.Deductible;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DeductibleRepository extends CrudRepository<Deductible, UUID> {

}
