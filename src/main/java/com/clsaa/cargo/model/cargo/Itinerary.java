package com.clsaa.cargo.model.cargo;

import com.clsaa.cargo.annotation.AggregateRoot;
import com.clsaa.cargo.annotation.Entity;

import java.util.List;

@AggregateRoot
@Entity
public class Itinerary {
    private String itineraryNumber;
    private List<Leg> legs;
}
