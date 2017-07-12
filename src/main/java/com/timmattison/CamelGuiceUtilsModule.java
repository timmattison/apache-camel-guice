package com.timmattison;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Created by haridasn on 19/5/15.
 */

/**
 * Special optional module only gets used while running  in the standalone mode.
 */
public class CamelGuiceUtilsModule extends AbstractModule {

    protected void configure() {
        bind(String.class)
                .annotatedWith(Names.named("httpComponentName"))
                .toInstance("restlet");
    }
}
