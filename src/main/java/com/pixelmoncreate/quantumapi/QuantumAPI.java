package com.pixelmoncreate.quantumapi;

import com.pixelmoncreate.quantumapi.config.ModConfigs;
import com.pixelmoncreate.quantumapi.handler.BowFOVHandler;
import com.pixelmoncreate.quantumapi.handler.NBTTooltipHandler;
import com.pixelmoncreate.quantumapi.handler.TagTooltipHandler;
import com.pixelmoncreate.quantumapi.util.FeatureFlagInitializer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(QuantumAPI.MODID)
public class QuantumAPI {

    public static final String NAME = "Quantum API";
    public static final String MODID = "quantumapi";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);


    public QuantumAPI() {

        IEventBus BUS = FMLJavaModLoadingContext.get().getModEventBus();


        BUS.addListener(this::commonSetup);

        FeatureFlagInitializer.init();

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ModConfigs.CLIENT);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModConfigs.COMMON);


        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {



    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {



    }


    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

            MinecraftForge.EVENT_BUS.register(new BowFOVHandler());
            MinecraftForge.EVENT_BUS.register(new TagTooltipHandler());
            MinecraftForge.EVENT_BUS.register(new NBTTooltipHandler());

        }
    }
}
