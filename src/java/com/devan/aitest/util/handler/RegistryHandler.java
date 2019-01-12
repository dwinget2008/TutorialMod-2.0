package com.devan.aitest.util.handler;

import com.devan.aitest.Main;
import com.devan.aitest.entity.EntityTestVillager;
import com.devan.aitest.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber(modid = Reference.MODID)
@GameRegistry.ObjectHolder(Reference.MODID)
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent<Item> event){

    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent<Block> event){

    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
//        for(Item item : ItemInit.ITEMS)
//            if(item instanceof IHasModel)
//                ((IHasModel)item).registerModels();
//
//        for(Block block : BlockInit.BLOCKS)
//            if(block instanceof IHasModel)
//                ((IHasModel)block).registerModels();
    }

    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityEntry> event){
        registerEntity("testvillager", EntityTestVillager.class, Reference.ENTITY_TEST_VILLAGER, 50, 3093151, 3121457);
        Main.proxy.registerEntityRender();
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
    }
}
