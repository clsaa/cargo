package com.clsaa.cargo.model.cargo;

import com.clsaa.cargo.annotation.AggregatePart;
import com.clsaa.cargo.annotation.ValueObject;
import com.clsaa.cargo.model.location.LocationShared;

import java.util.Date;

@AggregatePart(root = Cargo.class)
@ValueObject(root = Cargo.class)
public class DeliverySpecification {
    private Date arrivalDeadline;
    private LocationShared locationShared;
}
