package com.clsaa.cargo.model.customer;

import com.clsaa.cargo.annotation.ValueObject;

@ValueObject
public class CustomerShare {
    private String customerId;

    public CustomerShare(Customer customer) {
        this.customerId = customer.getCustomerId();
    }
}
