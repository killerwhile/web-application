package com.example.application.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import java.io.IOException;

/**
 * Created by david on 3/9/15
 */
public class ExampleRequestLoggingFilter implements ContainerRequestFilter {

    private static final Logger logger = LoggerFactory.getLogger(ExampleRequestLoggingFilter.class);

    @Context
    private HttpServletRequest servletRequest;
    
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        logger.info(containerRequestContext.getMethod() + " " + containerRequestContext.getUriInfo().getRequestUri().toString() + " " + servletRequest.getRemoteAddr());
    }
    
}
