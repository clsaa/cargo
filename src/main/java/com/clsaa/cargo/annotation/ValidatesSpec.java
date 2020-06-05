package com.clsaa.cargo.annotation;

import java.lang.annotation.*;

/**
 * @author liwenjun
 * @ClassName ValidatesSpec
 * @Date 2020-01-06 13:36
 */
@Documented
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface  ValidatesSpec {
}
