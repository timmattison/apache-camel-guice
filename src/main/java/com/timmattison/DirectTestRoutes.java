package com.timmattison;

import com.timmattison.jndibeans.interfaces.SayHello1;
import com.timmattison.jndibeans.interfaces.SayHello2;
import com.timmattison.jndibeans.interfaces.SayHello3;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created by timmattison on 10/27/14.
 */
public class DirectTestRoutes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from(CamelConstants.DIRECT_TEST_ROUTE_1)
                .beanRef(SayHello1.class.getName());

        from(CamelConstants.DIRECT_TEST_ROUTE_2)
                .beanRef(SayHello2.class.getName());

        from(CamelConstants.DIRECT_TEST_ROUTE_3)
                .beanRef(SayHello3.class.getName());
    }
}
