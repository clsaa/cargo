package com.clsaa.cargo.model.location;

import com.clsaa.cargo.annotation.Entity;

@Entity
public class Location {
    private String portCode;

    public String getPortCode() {
        return portCode;
    }

    public void setPortCode(String portCode) {
        this.portCode = portCode;
    }
}
