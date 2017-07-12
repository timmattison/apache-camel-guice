package com.timmattison.servlet;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.timmattison.CamelGuiceApplicationModule;

/**
 * Created by haridasn on 18/5/15.
 */
public class CamelServletContextListener extends GuiceServletContextListener {

    protected Injector getInjector() {
        Injector injector = Guice.createInjector(
                new CamelServletModule(),
                new CamelGuiceApplicationModule()
        );
        return injector;
    }
}
