package com.timmattison.jndibeans;

import com.timmattison.jndibeans.interfaces.SayHello1;
import com.timmattison.nonjndibeans.interfaces.MessageHandler;
import org.apache.camel.Exchange;

import javax.inject.Inject;

/**
 * Created by timmattison on 10/27/14.
 */
public class BasicSayHello1 implements SayHello1 {
    private final MessageHandler messageHandler;

    @Inject
    public BasicSayHello1(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getOut().setBody(messageHandler.getMessage(getClass().getName()));
    }
}
