package com.timmattison;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

/**
 * Created by timmattison on 10/27/14.
 */
public class RestRoutes extends RouteBuilder {
    public static final String SERVLET = "servlet";

    @Override
    public void configure() throws Exception {
        restConfiguration().bindingMode(RestBindingMode.auto).component(SERVLET);

        rest(HttpConstants.TEST_URL_1)
                .get().to(CamelConstants.DIRECT_TEST_ROUTE_1);

        rest(HttpConstants.TEST_URL_2)
                .get().to(CamelConstants.DIRECT_TEST_ROUTE_2);

        rest(HttpConstants.TEST_URL_3)
                .get().to(CamelConstants.DIRECT_TEST_ROUTE_3);
    }
}
