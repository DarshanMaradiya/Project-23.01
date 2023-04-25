package com.addressclient.addressapp.service;

import java.util.Optional;

import com.addressclient.addressapp.model.Address;
import com.addressclient.addressapp.repository.AddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Iterable<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address addUser(Address address) {
        return addressRepository.save(address);
    }

    public Address findByAddressId(Long addressId) {
        return addressRepository.findByAddressId(addressId);
    }

    public void deleteAddress(Address address) {
        // for (User user : users)
        // userService.setAddressNull(user);
        addressRepository.delete(address);
    }
}
