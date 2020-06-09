package com.clsaa.cargo.model.location;

import com.clsaa.cargo.annotation.DefinesIdentity;
import com.clsaa.cargo.annotation.Entity;

@Entity
public class Location {
    @DefinesIdentity
    private String id;
    private String portCode;

    public String getPortCode() {
        return portCode;
    }

    public void setPortCode(String portCode) {
        this.portCode = portCode;
    }
}
