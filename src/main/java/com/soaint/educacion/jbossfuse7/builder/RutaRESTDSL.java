package com.soaint.educacion.jbossfuse7.builder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.soaint.educacion.jbossfuse7.Types.Persona;

@Component
public class RutaRESTDSL  extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		restConfiguration()
			.component("restlet")
			.host("localhost").port("8080")
			.bindingMode(RestBindingMode.json);
		
		rest().path("/api").consumes("aplication/json")
			.get().path("/api/saludo").id("ruta-get")
			.to("bean:HelloBean")
			.post().path("/api/saludo")
			.type(Persona.class).id("ruta-post")
			.to("bean:postBean");
	}
	
}
