package consular.extraweapons.common.Tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem {

    public SwordBase(ToolMaterial material) {
        super(material, 0, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    }
    
}
