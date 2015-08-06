package com.mobiusinversion.web.application.providers;

import com.mobiusinversion.web.application.filters.ExampleRequestFormattingFilter;
import com.mobiusinversion.web.application.filters.ExampleRequestLoggingFilter;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;

/**
 * Created by david on 3/9/15
 */
@Provider
public class ExampleRequestFilterProvider implements DynamicFeature {

    @Context
    private HttpServletRequest servletRequest;
    
    @Override
    public void configure(ResourceInfo resourceInfo, FeatureContext featureContext) {
        featureContext.register(new ExampleRequestFormattingFilter());
        featureContext.register(new ExampleRequestLoggingFilter(servletRequest));
    }
    
}
