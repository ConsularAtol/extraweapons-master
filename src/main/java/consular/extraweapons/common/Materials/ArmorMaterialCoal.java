package consular.extraweapons.common.Materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ArmorMaterialCoal implements ArmorMaterial{

    //Durability and protection amounts in order from boots to helmet.
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNTS = new int[] {1, 4, 5, 2};

    @Override
    public int getDurability(EquipmentSlot arg0) {
        //Multiply the durability
        return BASE_DURABILITY[arg0.getEntitySlotId()]*10;
    }
    @Override
    public int getProtectionAmount(EquipmentSlot arg0) {
        return PROTECTION_AMOUNTS[arg0.getEntitySlotId()];
    }
    @Override
    public int getEnchantability() {
        return 3;
    }
    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COAL);
    }
    @Override
    public String getName() {
        return "coal";
    }
    @Override
    public float getToughness() {
        return 0;
    }
    @Override
    public float getKnockbackResistance() {
        return 1;
    }
    
    
}
