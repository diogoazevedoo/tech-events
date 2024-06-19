package com.techevents.api.service;

import com.techevents.api.domain.address.Address;
import com.techevents.api.domain.event.Event;
import com.techevents.api.domain.event.EventRequestDTO;
import com.techevents.api.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Address createAddress(EventRequestDTO data, Event event) {
        Address address = new Address();
        address.setCity(data.city());
        address.setEvent(event);

        return addressRepository.save(address);
    }
}
