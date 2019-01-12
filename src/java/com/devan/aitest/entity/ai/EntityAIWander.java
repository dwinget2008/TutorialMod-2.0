package com.devan.aitest.entity.ai;

import com.devan.aitest.entity.EntityTestVillager;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;

public class EntityAIWander extends EntityAIWanderAvoidWater {
    private EntityTestVillager villager;

    public EntityAIWander(EntityTestVillager villager, double speed) {
        super(villager, speed);
        this.villager = villager;
    }

    @Override
    public void startExecuting() {
        super.startExecuting();
        this.villager.playServerAnimation("walking");
    }

    @Override
    public boolean shouldContinueExecuting() {
        boolean shouldContinue = super.shouldContinueExecuting();
        if(!shouldContinue)
            this.villager.stopServerAnimation("walking");
        return shouldContinue;
    }
}
