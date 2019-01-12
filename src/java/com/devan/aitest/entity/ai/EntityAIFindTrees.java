package com.devan.aitest.entity.ai;

import com.devan.aitest.entity.EntityTestVillager;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIMoveToBlock;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.lang.reflect.Field;

public class EntityAIFindTrees extends EntityAIMoveToBlock {
    private final EntityTestVillager villager;

    public EntityAIFindTrees(EntityTestVillager villager, double speedIn, int length) {
        super(villager, speedIn, length);
        this.villager = villager;
    }


    @Override
    protected boolean shouldMoveTo(World world, BlockPos blockPos) {
        Block block = world.getBlockState(blockPos).getBlock();
        if (block == Blocks.FARMLAND) {
            return true;
        }

        return false;
    }

    @Override
    public void startExecuting() {
        super.startExecuting();
        this.villager.playServerAnimation("walking");
    }

    @Override
    public void updateTask() {
        super.updateTask();
        this.villager.stopServerAnimation("walking");
    }
}
