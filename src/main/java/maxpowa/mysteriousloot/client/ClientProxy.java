package maxpowa.mysteriousloot.client;

import maxpowa.mysteriousloot.CommonProxy;
import maxpowa.mysteriousloot.client.render.CustomSpellbookRenderer;
import maxpowa.mysteriousloot.items.ExtraItems;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.registerItemRenderer(ExtraItems.uselessBook, new CustomSpellbookRenderer());
	}

}
