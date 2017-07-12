package com.timmattison;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by timmattison on 10/27/14.
 */
public class RestRoutes extends RouteBuilder {

    @Inject @Named("httpComponentName")
    public String httpComponentName;

    public static final String SERVLET = "servlet";

    @Override
    public void configure() throws Exception {
        if (this.httpComponentName.equals(SERVLET)) {
            restConfiguration().bindingMode(RestBindingMode.auto).component(SERVLET);
        }else {
            // Assumes that we are running standalone mode.
            restConfiguration().bindingMode(RestBindingMode.auto).component("restlet").port("8080");
        }

        rest(HttpConstants.TEST_URL_1)
                .get().to(CamelConstants.DIRECT_TEST_ROUTE_1);

        rest(HttpConstants.TEST_URL_2)
                .get().to(CamelConstants.DIRECT_TEST_ROUTE_2);

        rest(HttpConstants.TEST_URL_3)
                .get().to(CamelConstants.DIRECT_TEST_ROUTE_3);
    }
}
