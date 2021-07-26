package com.giantpotato.rings_reloaded.rings.special_rings;

import com.giantpotato.rings_reloaded.RingsReloaded;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Ring extends Item {

    public static ItemGroup group = RingsReloaded.advanced_group;
    public static String MODE = "Default Mode";

    public Ring(Settings settings) {
        super(settings.group(group));
    }

    //Mode code
    public enum Mode {
        ACTIVE(true),
        INACTIVE(false);

        final boolean state;
        Mode(boolean state)
        {
            this.state = state;
        }
        public boolean getBoolean()
        {
            return state;
        }
    }
    public static void checkTag(ItemStack stack){
        if (!stack.isEmpty()) {
            if (!stack.hasTag()) {
                stack.setTag(new CompoundTag());
            }
            
            CompoundTag nbt = stack.getTag();

            if (!nbt.contains(MODE)) {
                nbt.putBoolean(MODE, false);
            }
        }
    }
    public boolean isActive(ItemStack stack){ return getMode(stack).getBoolean(); }
    public void toggleMode(ItemStack stack) {
        Mode currentMode = getMode(stack);
        if (currentMode.getBoolean()) {
            setMode(stack, Mode.INACTIVE);
            return;
        }
        setMode(stack, Mode.ACTIVE);
    }
    public static Mode getMode(ItemStack stack){
        if(!stack.isEmpty()){
            checkTag(stack);

            return stack.getTag().getBoolean(MODE) ? Mode.ACTIVE : Mode.INACTIVE;
        }
        return Mode.INACTIVE;
    }
    public static void setMode(ItemStack stack, Mode mode){
        checkTag(stack);
        stack.getTag().putBoolean(MODE, mode.getBoolean());
    }
}