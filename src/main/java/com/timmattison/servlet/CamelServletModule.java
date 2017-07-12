package com.timmattison.servlet;

import com.google.inject.Singleton;
import com.google.inject.servlet.ServletModule;
import com.timmattison.CamelGuiceApplicationModule;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;

import java.util.HashMap;

/**
 * Created by haridasn on 18/5/15.
 */
public class CamelServletModule extends ServletModule {
    @Override
    protected void configureServlets() {
        // Do servlet mapping here. Guice Filter will take care of remaining
        // handover to this servlet here.

//        // Install the Required guice module.
//        bind(CamelHttpTransportServlet.class).in(Singleton.class);
//
//        HashMap<String, String> servletParams = new HashMap<String, String>();
//        servletParams.put("servletName", "CamelServlet");
//        // Map the Servlet Urls.
//        serve("/*").with(CamelHttpTransportServlet.class, servletParams);
    }
}
