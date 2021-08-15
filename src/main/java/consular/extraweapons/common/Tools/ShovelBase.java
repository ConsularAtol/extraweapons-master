package consular.extraweapons.common.Tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem {

    public ShovelBase(ToolMaterial material) {
        super(material, -1.5f, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));
    }
    
}
