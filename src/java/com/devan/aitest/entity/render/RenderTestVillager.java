package com.devan.aitest.entity.render;

import com.devan.aitest.entity.EntityTestVillager;
import com.devan.aitest.util.Reference;
import com.leviathanstudio.craftstudio.client.model.ModelCraftStudio;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

public class RenderTestVillager<T extends EntityTestVillager> extends RenderLiving<T> {

    public static final Factory FACTORY = new Factory();

    public RenderTestVillager(RenderManager manager){
        super(manager, new ModelCraftStudio(Reference.MODID, "testvillager", 64), 0.5F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(T entity) {
        return new ResourceLocation(Reference.MODID, "textures/entity/testvillager.png");
    }

    public static class Factory<T extends EntityTestVillager> implements IRenderFactory<T>{

        @Override
        public Render<? super T> createRenderFor(RenderManager renderManager) {
            return new RenderTestVillager(renderManager);
        }
    }
}
