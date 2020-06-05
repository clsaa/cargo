package com.clsaa.cargo.model.cargo;

import com.clsaa.cargo.annotation.AggregatePart;
import com.clsaa.cargo.annotation.Entity;
import com.clsaa.cargo.model.voyage.CarrierMovement;

import java.util.Date;

@AggregatePart
@Entity
public class HandlingEvent {
    private Date completionTime;
    private CarrierMovement carrierMovement;
    private Cargo cargo;
}
