package com.clsaa.cargo.model.cargo;

import com.clsaa.cargo.annotation.AggregateRoot;
import com.clsaa.cargo.annotation.Entity;
import com.clsaa.cargo.model.customer.CustomerRepository;

@AggregateRoot
@Entity
public class Cargo {
    private String trackingId;
    private DeliverySpecification deliverySpecification;
    private Itinerary itinerary;

    public Cargo(CustomerRepository customerRepository) {

    }
}
