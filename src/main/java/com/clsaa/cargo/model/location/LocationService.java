package com.clsaa.cargo.model.location;

import com.clsaa.cargo.annotation.DomainService;

@DomainService
public interface LocationService {
    Location resolveByPortCode(String code);
}
