package com.clsaa.cargo.model.cargo;

import com.clsaa.cargo.annotation.Entity;
import com.clsaa.cargo.model.voyage.CarrierMovement;

import java.util.Date;

@Entity
public class HandlingEvent {
    private Date completionTime;
    private CarrierMovement carrierMovement;
    private Cargo cargo;
}
