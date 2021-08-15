package consular.extraweapons.common.registry;

import consular.extraweapons.common.ExtraWeapons;
import consular.extraweapons.common.Armor.BaseArmor;
import consular.extraweapons.common.Materials.ArmorMaterialEmerald;
import consular.extraweapons.common.Materials.ArmorMaterialLapis;
import consular.extraweapons.common.Materials.ArmorMaterialRedstone;
import consular.extraweapons.common.Materials.ToolMaterialEmerald;
import consular.extraweapons.common.Materials.ToolMaterialLapis;
import consular.extraweapons.common.Materials.ToolMaterialRedstone;
import consular.extraweapons.common.Tools.AxeBase;
import consular.extraweapons.common.Tools.HoeBase;
import consular.extraweapons.common.Tools.PickaxeBase;
import consular.extraweapons.common.Tools.ShovelBase;
import consular.extraweapons.common.Tools.SwordBase;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
//import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    private static final String MODID = ExtraWeapons.MODID;

    //public static final Item RAW_BAT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).meat().statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,20*6), 0.25f).build()));
    //public static final Item COOKED_BAT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(7.2f).meat().build()));

    public static final ArmorMaterial REDSTONE_ARMOR = new ArmorMaterialRedstone();
    public static final ArmorMaterial LAPIS_ARMOR = new ArmorMaterialLapis();
    public static final ArmorMaterial EMERALD_ARMOR = new ArmorMaterialEmerald();

    public static void registerItems(){
        //Registry.register(Registry.ITEM,new Identifier(MODID,"raw_bat"), RAW_BAT);
        //Registry.register(Registry.ITEM,new Identifier(MODID,"cooked_bat"), COOKED_BAT);

        Registry.register(Registry.ITEM,new Identifier(MODID,"redstone_pickaxe"), new PickaxeBase(new ToolMaterialRedstone()));
        Registry.register(Registry.ITEM,new Identifier(MODID,"redstone_axe"), new AxeBase(new ToolMaterialRedstone()));
        Registry.register(Registry.ITEM,new Identifier(MODID,"redstone_sword"), new SwordBase(new ToolMaterialRedstone()));
        Registry.register(Registry.ITEM,new Identifier(MODID,"redstone_shovel"), new ShovelBase(new ToolMaterialRedstone()));
        Registry.register(Registry.ITEM,new Identifier(MODID,"redstone_hoe"), new HoeBase(new ToolMaterialRedstone()));
        Registry.register(Registry.ITEM,new Identifier(MODID,"lapis_pickaxe"), new PickaxeBase(new ToolMaterialLapis()));
        Registry.register(Registry.ITEM,new Identifier(MODID,"lapis_axe"), new AxeBase(new ToolMaterialLapis()));
        Registry.register(Registry.ITEM,new Identifier(MODID,"lapis_sword"), new SwordBase(new ToolMaterialLapis()));
        Registry.register(Registry.ITEM,new Identifier(MODID,"lapis_shovel"), new ShovelBase(new ToolMaterialLapis()));
        Registry.register(Registry.ITEM,new Identifier(MODID,"lapis_hoe"), new HoeBase(new ToolMaterialLapis()));
        Registry.register(Registry.ITEM,new Identifier(MODID,"emerald_pickaxe"), new PickaxeBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM,new Identifier(MODID,"emerald_axe"), new AxeBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM,new Identifier(MODID,"emerald_sword"), new SwordBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM,new Identifier(MODID,"emerald_shovel"), new ShovelBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM,new Identifier(MODID,"emerald_hoe"), new HoeBase(new ToolMaterialEmerald()));

        Registry.register(Registry.ITEM, new Identifier(MODID,"redstone_helmet"), new BaseArmor(REDSTONE_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(MODID,"redstone_chestplate"), new BaseArmor(REDSTONE_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(MODID,"redstone_leggings"), new BaseArmor(REDSTONE_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(MODID,"redstone_boots"), new BaseArmor(REDSTONE_ARMOR, EquipmentSlot.FEET));
        Registry.register(Registry.ITEM, new Identifier(MODID,"lapis_helmet"), new BaseArmor(LAPIS_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(MODID,"lapis_chestplate"), new BaseArmor(LAPIS_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(MODID,"lapis_leggings"), new BaseArmor(LAPIS_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(MODID,"lapis_boots"), new BaseArmor(LAPIS_ARMOR, EquipmentSlot.FEET));
        Registry.register(Registry.ITEM, new Identifier(MODID,"emerald_helmet"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(MODID,"emerald_chestplate"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(MODID,"emerald_leggings"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(MODID,"emerald_boots"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.FEET));
    }
}
