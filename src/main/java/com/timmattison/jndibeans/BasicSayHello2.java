package com.timmattison.jndibeans;

import com.timmattison.jndibeans.interfaces.SayHello2;
import com.timmattison.nonjndibeans.interfaces.MessageHandler;
import org.apache.camel.Exchange;

import javax.inject.Inject;

/**
 * Created by timmattison on 10/27/14.
 */
public class BasicSayHello2 implements SayHello2 {
    private final MessageHandler messageHandler;

    @Inject
    public BasicSayHello2(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getOut().setBody(messageHandler.getMessage(getClass().getName()));
    }
}
