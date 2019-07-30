package xyz.vsngamer.elevator.network;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import xyz.vsngamer.elevator.init.ModConfig;

public class SyncConfigHandler implements IMessageHandler<SyncConfig, IMessage> {

    @Override
    public IMessage onMessage(SyncConfig message, MessageContext ctx) {
        setClientConfig(message.getSameColor(), message.getRange());
        return null;
    }

    public static void setClientConfig(boolean sameColor, int range){
        ModConfig.getClientConfig().sameColor = sameColor;
        ModConfig.getClientConfig().range = range;
    }
}