package com.grandhunterman.dnvm.client.handler;

import com.grandhunterman.dnvm.client.settings.KeyBindings;
import com.grandhunterman.dnvm.reference.Key;
import com.grandhunterman.dnvm.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.com)
 */
public class KeyInputEventHandler {
    private static Key getPressedKeybinding(){
        if (KeyBindings.explode.isPressed()){
            return Key.EXPLODE;

        }
        return null;


    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {
        LogHelper.info(getPressedKeybinding());
    }

}
