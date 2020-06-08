package com.clsaa.cargo.model.voyage;

import com.clsaa.cargo.annotation.AggregateRoot;
import com.clsaa.cargo.annotation.Entity;

@AggregateRoot
@Entity(root = Voyage.class)
public class Voyage {
    private String voyageNumber;
    private CarrierMovement carrierMovement;
}
