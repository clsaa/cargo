package com.clsaa.cargo.model.cargo;

import com.clsaa.cargo.annotation.AggregatePart;
import com.clsaa.cargo.annotation.Entity;

import java.util.Date;
import java.util.List;

@AggregatePart(root = Cargo.class)
@Entity(root = Cargo.class)
public class DeliveryHistory {
    private List<HandlingEvent> handlingEvents;
    private Cargo cargo;
}
