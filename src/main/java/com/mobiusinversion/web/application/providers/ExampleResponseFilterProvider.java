package com.mobiusinversion.web.application.providers;

import com.mobiusinversion.web.application.filters.ExampleResponseLoggingFilter;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;

@Provider
public class ExampleResponseFilterProvider implements DynamicFeature {

    @Override
    public void configure(ResourceInfo resourceInfo, FeatureContext featureContext) {
        featureContext.register(new ExampleResponseLoggingFilter());
    }

}
