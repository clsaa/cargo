package com.clsaa.cargo.model.cargo;

import com.clsaa.cargo.annotation.Repository;

import java.util.List;

@Repository
public interface CargoRepository {
    List<Cargo> findByName(String name);
    List<Cargo> findByCustomerId(String customerId);
}

