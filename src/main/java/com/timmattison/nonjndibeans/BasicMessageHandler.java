package com.timmattison.nonjndibeans;

import com.timmattison.nonjndibeans.interfaces.MessageHandler;

import javax.inject.Singleton;

/**
 * Created by timmattison on 10/28/14.
 */
@Singleton
public class BasicMessageHandler implements MessageHandler {
    public String getMessage(String input) {
        return "Hello " + input + "!";
    }
}
