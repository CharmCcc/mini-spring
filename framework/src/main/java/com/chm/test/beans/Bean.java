package com.chm.test.beans;

import jdk.nashorn.internal.ir.annotations.Reference;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Bean {

}
