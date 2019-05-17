package com.sheridan.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/test")
public class HelloWorldService {

	@GET
	@Path("/hello")
	public Response getMsg() {
		String output = "Hello, API!";
		return Response.status(200).entity(output).build();
	}
}
