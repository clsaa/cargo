package com.clsaa.cargo.model.voyage;

import com.clsaa.cargo.annotation.AggregatePart;
import com.clsaa.cargo.model.location.Location;
import com.clsaa.cargo.model.location.LocationService;

import java.util.Date;

@AggregatePart
public class CarrierMovement {
    private Location departureLocation;
    private Location arrivalLocation;
    private Date departureTime;
    private Date arrivalTime;

    public CarrierMovement(LocationService locationService) {
    }
}
