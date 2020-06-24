package com.clsaa.cargo.model.voyage;

import com.clsaa.cargo.annotation.AggregateRoot;
import com.clsaa.cargo.annotation.DefinesIdentity;
import com.clsaa.cargo.annotation.Entity;

@AggregateRoot
@Entity(root = Voyage.class)
public class Voyage {
    @DefinesIdentity
    private String voyageNumber;
    private CarrierMovement carrierMovement;
}
