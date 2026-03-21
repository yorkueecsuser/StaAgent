package com.facebook.infer.annotation;
import java.lang.annotation.*;
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD})
public @interface Lockless {}
