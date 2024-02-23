package com.github.carlossilva.springbootobservability.rest;

import com.github.carlossilva.springbootobservability.dto.ResourceDto;
import jakarta.inject.Named;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Named
@Path("v1/my-resources")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MyResourceController {

    @GET
    @Path("{id}")
    public ResourceDto getMetadata(@PathParam("id") long id) {

        ResourceDto resource = new ResourceDto();
        resource.setId(id);
        resource.setCode("code");
        resource.setName("Carlos Silva");

        return resource;
    }
}
