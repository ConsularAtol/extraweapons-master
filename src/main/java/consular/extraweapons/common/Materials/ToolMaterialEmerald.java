package consular.extraweapons.common.Materials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialEmerald implements ToolMaterial {

    @Override
    public int getDurability() {
        return 1100;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7f;
    }

    @Override
    public float getAttackDamage() {
        return 5.5f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.EMERALD);
    }
    
}
