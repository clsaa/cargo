package com.clsaa.cargo.model.location;

import com.clsaa.cargo.annotation.ValueObject;
import com.clsaa.cargo.model.cargo.DeliverySpecification;

@ValueObject
public class LocationShared {
    private String portCode;
    private DeliverySpecification deliverySpecification;

    public LocationShared(Location location) {
        this.portCode = location.getPortCode();
    }
}
