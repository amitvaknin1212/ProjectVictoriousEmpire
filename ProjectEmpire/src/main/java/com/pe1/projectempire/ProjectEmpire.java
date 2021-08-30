package com.pe1.projectempire;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pe1.projectempire.core.init.ItemInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("projectempire")
public class ProjectEmpire
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "projectempire";
    public ProjectEmpire() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	
    	ItemInit.ITEMS.register(bus);
    	
        MinecraftForge.EVENT_BUS.register(this);
    }
}
