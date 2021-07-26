package com.giantpotato.rings_reloaded.rings.crude_rings;

import com.giantpotato.rings_reloaded.rings.special_rings.Ring;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class WaterbreathingRing extends Ring {

    public static final int DURABILITY = 2048;

    StatusEffectInstance waterbreathing_effect = new StatusEffectInstance(
            StatusEffects.WATER_BREATHING,
            0,
            1,
            false,
            false);

    public WaterbreathingRing(Settings settings) {
        super(settings.maxDamage(DURABILITY));
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient() && isActive(stack)){
            PlayerEntity player = (PlayerEntity) entity;
            player.applyStatusEffect(waterbreathing_effect);
        }
    }



}
