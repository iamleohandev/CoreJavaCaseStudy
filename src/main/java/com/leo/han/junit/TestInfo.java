package com.leo.han.junit;

import java.lang.annotation.*;


@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestInfo {
	
	public enum Priority { LOW, HIGH, MEDIUM}
	
	double revision() default 1.0;
	String createdBy() default "Leonard Han";
	String createdDate() default "June 2nd, 2014";
	Priority priority() default Priority.LOW;

}
