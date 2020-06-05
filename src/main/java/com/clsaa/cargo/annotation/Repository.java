package com.clsaa.cargo.annotation;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Repository {

}
