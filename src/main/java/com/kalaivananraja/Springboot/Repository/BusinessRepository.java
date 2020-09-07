package com.kalaivananraja.Springboot.Repository;

import org.springframework.data.repository.CrudRepository;

import com.kalaivananraja.Springboot.Model.BusinessPartner;

/**
 * stores excel data
 * 
 * 
 * @author Kalaivanan Raja
 *
 */
public interface BusinessRepository extends CrudRepository<BusinessPartner, Long> {

}
