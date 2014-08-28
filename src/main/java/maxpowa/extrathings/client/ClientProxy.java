package maxpowa.extrathings.client;

import net.minecraftforge.client.MinecraftForgeClient;
import maxpowa.extrathings.CommonProxy;
import maxpowa.extrathings.client.render.CustomSpellbookRenderer;
import maxpowa.extrathings.items.ExtraItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.registerItemRenderer(ExtraItems.uselessBook, new CustomSpellbookRenderer());
	}

}
