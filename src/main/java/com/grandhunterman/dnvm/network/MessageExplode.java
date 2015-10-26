package com.grandhunterman.dnvm.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Definitely Not Vanilla Minecraft
 * Copyright (C) 2015  GrandHunterMan (http://www.grandhunterman.com)
 */
public class MessageExplode extends MessageBase<MessageExplode> {

    @Override
    public void handleClientSide(MessageExplode message, EntityPlayer player) {

    }

    @Override
    public void handleServerSide(MessageExplode message, EntityPlayer player) {
        player.worldObj.createExplosion(player, player.posX, player.posY, player.posZ, 3f, true);
    }

    @Override
    public void fromBytes(ByteBuf buf) {

    }

    @Override
    public void toBytes(ByteBuf buf) {

    }
}
