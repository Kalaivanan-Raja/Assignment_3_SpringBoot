package com.kalaivananraja.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kalaivananraja.springboot.model.BusinessPartner;

/**
 * stores excel data
 * 
 * 
 * @author Kalaivanan Raja
 *
 */
@Repository
public interface BusinessRepository extends CrudRepository<BusinessPartner, Integer> {

}
