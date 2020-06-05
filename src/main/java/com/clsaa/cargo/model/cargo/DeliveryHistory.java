package com.clsaa.cargo.model.cargo;

import com.clsaa.cargo.annotation.Entity;

import java.util.Date;
import java.util.List;

@Entity
public class DeliveryHistory {
    private List<HandlingEvent> handlingEvents;
    private Cargo cargo;
}
