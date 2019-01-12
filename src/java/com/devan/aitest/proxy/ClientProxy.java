package com.devan.aitest.proxy;

import com.devan.aitest.entity.EntityTestVillager;
import com.devan.aitest.entity.render.RenderTestVillager;
import com.devan.aitest.util.Reference;
import com.leviathanstudio.craftstudio.client.registry.CSRegistryHelper;
import com.leviathanstudio.craftstudio.client.registry.CraftStudioLoader;
import com.leviathanstudio.craftstudio.client.util.EnumRenderType;
import com.leviathanstudio.craftstudio.client.util.EnumResourceType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    @CraftStudioLoader
    public static void registerCraftStudioAssets(){
        CSRegistryHelper registry = new CSRegistryHelper(Reference.MODID);
        registry.register(EnumResourceType.MODEL, EnumRenderType.ENTITY, "testvillager");

        registry.register(EnumResourceType.ANIM, EnumRenderType.ENTITY, "walking");
    }

    @Override
    public void registerEntityRender() {
        RenderingRegistry.registerEntityRenderingHandler(EntityTestVillager.class, RenderTestVillager.FACTORY);
    }
}
