package com.mobiusinversion.web.application.filters;

import com.mobiusinversion.web.application.utils.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import java.io.IOException;

public class ExampleResponseLoggingFilter implements ContainerResponseFilter {

    private static final Logger logger = LoggerFactory.getLogger(ExampleRequestLoggingFilter.class);

    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        String entityJson = JsonUtils.objectToJson(containerResponseContext.getEntity());
        logger.info("entityJson: " + entityJson);
    }

}
