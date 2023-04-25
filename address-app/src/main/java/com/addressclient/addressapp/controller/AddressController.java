package com.addressclient.addressapp.controller;

import java.util.Optional;

import com.addressclient.addressapp.model.Address;
import com.addressclient.addressapp.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    AddressService addressService;;

    @GetMapping("/all")
    ResponseEntity<?> getAllAddress() {
        Iterable<Address> addresses = addressService.getAllAddresses();
        return new ResponseEntity<Iterable<Address>>(addresses, HttpStatus.OK);
    }

    @PostMapping("/add")
    ResponseEntity<?> addAddress(@RequestBody Address address, BindingResult result) {
        address = addressService.addUser(address);
        return new ResponseEntity<Address>(address, HttpStatus.CREATED);
    }

    @GetMapping("/byId/{addressId}")
    ResponseEntity<?> getAllAddress(@PathVariable Long addressId) {
        Address address = addressService.findByAddressId(addressId);
        return new ResponseEntity<Address>(address, HttpStatus.OK);
    }
}
