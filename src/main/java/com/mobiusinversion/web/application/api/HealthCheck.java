package com.mobiusinversion.web.application.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mobiusinversion.web.application.model.ServerHealthCheckResponse;

@Path("health")
public class HealthCheck {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/server")
    public ServerHealthCheckResponse appHealth() {
        return new ServerHealthCheckResponse();
    }
    
}

