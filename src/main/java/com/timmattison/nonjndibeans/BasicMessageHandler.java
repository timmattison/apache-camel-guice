package com.timmattison.nonjndibeans;

import com.timmattison.nonjndibeans.interfaces.MessageHandler;

/**
 * Created by timmattison on 10/28/14.
 */
public class BasicMessageHandler implements MessageHandler {
    @Override
    public String getMessage(String input) {
        return "Hello " + input + "!";
    }
}
