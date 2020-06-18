package com.clsaa.cargo.model.cargo;

import com.clsaa.cargo.annotation.AggregateRoot;
import com.clsaa.cargo.annotation.DefinesIdentity;
import com.clsaa.cargo.annotation.Entity;
import com.clsaa.cargo.model.customer.CustomerRepository;

@AggregateRoot
@Entity(root = Cargo.class)
public class Cargo {
    @DefinesIdentity
    private String trackingId;
    private DeliverySpecification deliverySpecification;
    private Itinerary itinerary;
    private DeliveryHistory deliveryHistory;

}
