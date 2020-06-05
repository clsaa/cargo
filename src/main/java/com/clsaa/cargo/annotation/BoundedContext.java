package com.clsaa.cargo.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.PACKAGE)
@Retention(RetentionPolicy.RUNTIME)
public @interface BoundedContext {
    String context() default "";
}
