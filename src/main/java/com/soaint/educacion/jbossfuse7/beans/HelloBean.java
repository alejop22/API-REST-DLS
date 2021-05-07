package com.soaint.educacion.jbossfuse7.beans;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
	public String sayHello() {
		return "Hello, world!";
	}
}
