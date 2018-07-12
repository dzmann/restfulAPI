package com.service;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;

import org.json.JSONObject;





@Path("/") 
public class testService {
	
	   @POST
	   @Path("/users") 
	   @Consumes(MediaType.APPLICATION_JSON)
	   @Produces(MediaType.APPLICATION_JSON)
	   public Response getUsers(){ 
		  
		   
		   JSONObject json = new JSONObject();
		   json.put("Nombre", "Danilo");
		   json.put("Apellido", "Zimermann");
		   json.put("Pais", "Uruguay");
		   return Response.status(200).entity(json.toString()).build();
	   }
	   
	   
	     
}
