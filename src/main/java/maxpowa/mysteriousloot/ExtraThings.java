package maxpowa.mysteriousloot;

import maxpowa.mysteriousloot.items.ExtraItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExtraThings.MODID, name = ExtraThings.MOD_NAME, version = ExtraThings.VERSION)
public class ExtraThings
{
	public static final String MODID = "extrathings";
	public static final String MOD_NAME = "Extra Things";
	public static final String VERSION = "${version}";

	@Instance(value = ExtraThings.MODID)
	public static ExtraThings instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="maxpowa.extrathings.client.ClientProxy", serverSide="maxpowa.extrathings.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ExtraItems.init();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
}
