package com.soaint.educacion.jbossfuse7.beans;

import org.springframework.stereotype.Component;

import com.soaint.educacion.jbossfuse7.Types.Persona;

@Component
public class PostBean {
	public String response(Persona persona) {
		return "Hello, world," + persona.getNombre()+" !";
	}
}
