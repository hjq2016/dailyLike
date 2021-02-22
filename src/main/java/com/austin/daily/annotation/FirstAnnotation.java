package com.austin.daily.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description
 * @Author hjq
 * @Date 2021/1/7
 */

@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.TYPE)
public @interface FirstAnnotation {

    String hh() default "222";
}
