package com.clsaa.cargo.model.cargo;

import com.clsaa.cargo.annotation.ValueObject;

import java.util.Date;

@ValueObject
public class Leg {
    private Date loadTime;
    private Date unloadTime;
}
