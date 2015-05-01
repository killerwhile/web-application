package com.example.application.providers;

import com.example.application.filters.ExampleRequestLoggingFilter;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;

/**
 * Created by david on 3/9/15
 */
@Provider
public class ExampleRequestFilterProvider implements DynamicFeature {

    @Override
    public void configure(ResourceInfo resourceInfo, FeatureContext featureContext) {
        ExampleRequestLoggingFilter exampleRequestLoggingFilter = new ExampleRequestLoggingFilter();
        featureContext.register(exampleRequestLoggingFilter);
    }
    
}
