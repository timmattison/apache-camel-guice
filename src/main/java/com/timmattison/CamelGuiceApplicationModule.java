package com.timmattison;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.timmattison.jndibeans.BasicSayHello1;
import com.timmattison.jndibeans.BasicSayHello2;
import com.timmattison.jndibeans.BasicSayHello3;
import com.timmattison.jndibeans.interfaces.SayHello1;
import com.timmattison.jndibeans.interfaces.SayHello2;
import com.timmattison.jndibeans.interfaces.SayHello3;
import com.timmattison.nonjndibeans.BasicMessageHandler;
import com.timmattison.nonjndibeans.interfaces.MessageHandler;
import org.apache.camel.guice.CamelModule;
import org.apache.camel.guice.CamelModuleWithMatchingRoutes;
import org.apache.camel.impl.DefaultCamelContext;

import javax.inject.Singleton;

/**
 * Created by timmattison on 10/27/14.
 */
public class CamelGuiceApplicationModule extends CamelModuleWithMatchingRoutes {

    @Override
    protected void configure() {

        super.configure(); // Camel-Context gets starts only after the Guice PostConstruct notification.

        bind(SayHello1.class).to(BasicSayHello1.class);
        bind(SayHello2.class).to(BasicSayHello2.class);
        bind(SayHello3.class).to(BasicSayHello3.class);

        bind(MessageHandler.class).to(BasicMessageHandler.class);
        bind(DefaultCamelContext.class).in(Singleton.class);

        // Configure the Routes to pick servlet component to serve the http requests.
        bind(String.class)
                .annotatedWith(Names.named("httpComponentName"))
                .toInstance("servlet");

        // Add Routes.
        bind(RestRoutes.class);
        bind(DirectTestRoutes.class);
    }
}
