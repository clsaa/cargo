package com.clsaa.cargo.annotation;

import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DefinesIdentity {

}
