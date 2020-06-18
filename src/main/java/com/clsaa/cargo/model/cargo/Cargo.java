package com.clsaa.cargo.model.cargo;

import com.clsaa.cargo.annotation.AggregateRoot;
import com.clsaa.cargo.annotation.DefinesIdentity;
import com.clsaa.cargo.annotation.Entity;
import com.clsaa.cargo.model.customer.Customer;
import com.clsaa.cargo.model.customer.CustomerRepository;
import com.clsaa.cargo.model.customer.CustomerShare;

@AggregateRoot
@Entity(root = Cargo.class)
public class Cargo {
    @DefinesIdentity
    private String trackingId;
    private DeliverySpecification deliverySpecification;
    private Itinerary itinerary;
    private DeliveryHistory deliveryHistory;

    public CustomerShare getCustomerShare(CustomerRepository customerRepository, String trackingID) {
        final Customer customer = customerRepository.findByCargoTrackingID(trackingID);
        return new CustomerShare(customer);
    }
}
