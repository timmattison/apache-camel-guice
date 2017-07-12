package com.timmattison.jndibeans;

import com.timmattison.jndibeans.interfaces.SayHello3;
import com.timmattison.nonjndibeans.interfaces.MessageHandler;
import org.apache.camel.Exchange;

import javax.inject.Inject;

/**
 * Created by timmattison on 10/27/14.
 */
public class BasicSayHello3 implements SayHello3 {
    private final MessageHandler messageHandler;

    @Inject
    public BasicSayHello3(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    public void process(Exchange exchange) throws Exception {
        exchange.getOut().setBody(messageHandler.getMessage(getClass().getName()));
    }
}
