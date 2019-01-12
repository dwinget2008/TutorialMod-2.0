package com.devan.aitest.entity;

import com.devan.aitest.entity.ai.EntityAIFindTrees;
import com.devan.aitest.entity.ai.EntityAIWander;
import com.devan.aitest.util.Reference;
import com.leviathanstudio.craftstudio.CraftStudioApi;
import com.leviathanstudio.craftstudio.common.animation.AnimationHandler;
import com.leviathanstudio.craftstudio.common.animation.simpleImpl.AnimatedEntity;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityTestVillager extends AnimatedEntity {

    static {
        EntityTestVillager.animHandler.addAnim(Reference.MODID, "walking", "testvillager", true);
    }

    public EntityTestVillager(World worldIn) {
        super(worldIn);
        this.tasks.addTask(1, new EntityAILookIdle(this));
        this.tasks.addTask(2, new EntityAIFindTrees(this, 0.5D, 20));
        this.tasks.addTask(3, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
    }

    public void playServerAnimation(String animation){
        if(!this.getAnimationHandler().isAnimationActive(Reference.MODID, animation, this))
            this.getAnimationHandler().networkStartAnimation(Reference.MODID, animation, this);
    }

    public void stopServerAnimation(String animation){
        if(this.getAnimationHandler().isAnimationActive(Reference.MODID, animation, this))
            this.getAnimationHandler().networkStopAnimation(Reference.MODID, animation, this);
    }
}
