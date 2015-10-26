package com.grandhunterman.dnvm.client.handler;

import com.grandhunterman.dnvm.client.settings.KeyBindings;
import com.grandhunterman.dnvm.handler.ConfigurationHandler;
import com.grandhunterman.dnvm.network.MessageExplode;
import com.grandhunterman.dnvm.network.NetworkHandler;
import com.grandhunterman.dnvm.reference.Key;
import com.grandhunterman.dnvm.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.com)
 */
public class KeyInputEventHandler {
    private static Key getPressedKeybinding() {
        if (KeyBindings.EXPLODE.isPressed()) {
            return Key.EXPLODE;

        }
        return null;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {
        Key key = getPressedKeybinding();
        if (key != null && ConfigurationHandler.explode_self){
            switch (key) {
                case EXPLODE:
                    NetworkHandler.sendToServer(new MessageExplode());
                    LogHelper.info(Minecraft.getMinecraft().thePlayer + "Boom!");
                    break;
                }
            }

        }


    }



