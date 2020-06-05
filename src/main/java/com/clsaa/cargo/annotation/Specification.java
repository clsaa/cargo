package com.clsaa.cargo.annotation;

import java.lang.annotation.*;
/**
 * @author liwenjun
 * @ClassName Specification
 * @Date 2019-12-11 13:01
 */
@Documented
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Specification {
}
