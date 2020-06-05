package com.clsaa.cargo.model.customer;

import com.clsaa.cargo.annotation.Entity;

@Entity
public class Customer {
    private String name;
    private String customerId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
