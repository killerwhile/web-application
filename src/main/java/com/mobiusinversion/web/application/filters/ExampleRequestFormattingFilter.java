package com.mobiusinversion.web.application.filters;

import com.mobiusinversion.web.application.utils.JsonUtils;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.MultivaluedMap;
import java.io.IOException;

public class ExampleRequestFormattingFilter  implements ContainerRequestFilter {
    
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        MultivaluedMap<String,String> headers = containerRequestContext.getHeaders();
        String headerJson = JsonUtils.objectToJson(headers);
        containerRequestContext.setProperty("headerJson", headerJson);
    }
    
}
