package com.devsouzx.api.services;

import com.devsouzx.api.domain.address.Address;
import com.devsouzx.api.domain.event.Event;
import com.devsouzx.api.domain.event.EventRequestDTO;
import com.devsouzx.api.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Address createAddress(EventRequestDTO data, Event event) {
        Address address = new Address();
        address.setCity(data.city());
        address.setUf(data.state());
        address.setEvent(event);

        return addressRepository.save(address);
    }
}
