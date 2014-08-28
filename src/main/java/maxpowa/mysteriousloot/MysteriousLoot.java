package maxpowa.mysteriousloot;

import maxpowa.mysteriousloot.items.MysteriousItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MysteriousLoot.MODID, name = MysteriousLoot.MOD_NAME, version = MysteriousLoot.VERSION)
public class MysteriousLoot
{
	public static final String MODID = "mysteriousloot";
	public static final String MOD_NAME = "Mysterious Loot";
	public static final String VERSION = "${version}";

	@Instance(value = MysteriousLoot.MODID)
	public static MysteriousLoot instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="maxpowa.mysteriousloot.client.ClientProxy", serverSide="maxpowa.mysteriousloot.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		MysteriousItems.init();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
}
