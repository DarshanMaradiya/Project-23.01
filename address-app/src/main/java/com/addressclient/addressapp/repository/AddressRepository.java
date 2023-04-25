package com.addressclient.addressapp.repository;

import com.addressclient.addressapp.model.Address;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

    Address findByAddressId(Long addressId);
}
