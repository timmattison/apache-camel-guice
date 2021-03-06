package com.timmattison;

import com.timmattison.jndibeans.BasicSayHello1;
import com.timmattison.jndibeans.BasicSayHello2;
import com.timmattison.jndibeans.BasicSayHello3;
import com.timmattison.jndibeans.interfaces.SayHello1;
import com.timmattison.jndibeans.interfaces.SayHello2;
import com.timmattison.jndibeans.interfaces.SayHello3;
import com.timmattison.nonjndibeans.BasicMessageHandler;
import com.timmattison.nonjndibeans.interfaces.MessageHandler;
import org.apache.camel.guice.CamelModuleWithMatchingRoutes;

/**
 * Created by timmattison on 10/27/14.
 */
public class CamelGuiceApplicationModule extends CamelModuleWithMatchingRoutes {
    @Override
    protected void configure() {
        super.configure();

        bind(SayHello1.class).to(BasicSayHello1.class);
        bind(SayHello2.class).to(BasicSayHello2.class);
        bind(SayHello3.class).to(BasicSayHello3.class);

        bind(MessageHandler.class).to(BasicMessageHandler.class);

        bind(RestRoutes.class);
        bind(DirectTestRoutes.class);
    }
}
