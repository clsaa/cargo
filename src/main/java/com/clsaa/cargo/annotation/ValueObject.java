package com.clsaa.cargo.annotation;



import casestudy.DefaultRoot;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValueObject {
    Class root() default DefaultRoot.class;
}
