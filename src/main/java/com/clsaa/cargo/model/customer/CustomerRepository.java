package com.clsaa.cargo.model.customer;

import com.clsaa.cargo.annotation.Repository;

import java.util.List;

@Repository
public interface CustomerRepository {
    List<Customer> findByName(String name);

    Customer findByCustomerId(String id);

    Customer findByCargoTrackingID(String trackingID);
}
