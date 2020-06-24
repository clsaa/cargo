package com.clsaa.cargo.model.cargo;

import com.clsaa.cargo.annotation.AggregateRoot;
import com.clsaa.cargo.annotation.DefinesIdentity;
import com.clsaa.cargo.annotation.Entity;

import java.util.List;

@AggregateRoot
@Entity(root = Itinerary.class)
public class Itinerary {
    @DefinesIdentity
    private String itineraryNumber;
    private List<Leg> legs;
}
