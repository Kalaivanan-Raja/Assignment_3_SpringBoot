package com.kalaivananraja.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.kalaivananraja.springboot.model.BusinessPartner;

/**
 * stores excel data
 * 
 * 
 * @author Kalaivanan Raja
 *
 */
public interface BusinessRepository extends CrudRepository<BusinessPartner, Long> {

}
