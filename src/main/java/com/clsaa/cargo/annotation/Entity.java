package com.clsaa.cargo.annotation;




import casestudy.DefaultRoot;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {
    Class root() default DefaultRoot.class;
}
