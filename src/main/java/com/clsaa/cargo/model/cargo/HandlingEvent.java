package com.clsaa.cargo.model.cargo;

import com.clsaa.cargo.annotation.AggregatePart;
import com.clsaa.cargo.annotation.DefinesIdentity;
import com.clsaa.cargo.annotation.Entity;
import com.clsaa.cargo.model.voyage.CarrierMovement;

import java.util.Date;

@AggregatePart(root = Cargo.class)
@Entity(root = Cargo.class)
public class HandlingEvent {
    @DefinesIdentity
    private String id;
    private Date completionTime;
    private CarrierMovement carrierMovement;
    private Cargo cargo;
}
