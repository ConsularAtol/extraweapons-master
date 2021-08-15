package consular.extraweapons.common;

import consular.extraweapons.common.registry.ModBlocks;
import consular.extraweapons.common.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class ExtraWeapons implements ModInitializer {

	public static final String MODID = "extraweapons";

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}
