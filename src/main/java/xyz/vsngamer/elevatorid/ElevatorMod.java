package xyz.vsngamer.elevatorid;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import xyz.vsngamer.elevatorid.network.NetworkHandler;

@Mod(ElevatorMod.ID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElevatorMod {

    public static final String ID = "elevatorid";

    public ElevatorMod() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, xyz.vsngamer.elevatorid.init.ModConfig.SPEC);
    }

    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        NetworkHandler.init();
    }


}
