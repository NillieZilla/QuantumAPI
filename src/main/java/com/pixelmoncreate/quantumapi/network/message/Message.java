package com.pixelmoncreate.quantumapi.network.message;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

import static org.apache.commons.codec.language.bm.Rule.ALL;

@SuppressWarnings(ALL)
public abstract class Message<T extends Message<T>> {
    public abstract T read(FriendlyByteBuf buffer);
    public abstract void write(T message, FriendlyByteBuf buffer);
    public abstract void onMessage(T message, Supplier<NetworkEvent.Context> context);

}