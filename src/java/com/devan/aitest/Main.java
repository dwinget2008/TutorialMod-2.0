package com.devan.aitest;

import com.devan.aitest.proxy.CommonProxy;
import com.devan.aitest.util.Reference;
import com.devan.aitest.util.handler.RegistryHandler;
import com.leviathanstudio.craftstudio.client.json.CSReadedModel;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event){}

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event){}

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event){}

}
