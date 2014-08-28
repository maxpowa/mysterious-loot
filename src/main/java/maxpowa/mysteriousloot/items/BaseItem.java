package maxpowa.mysteriousloot.items;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class BaseItem extends Item {
	
	public BaseItem() {
		super();
		this.setCreativeTab(MysteriousItems.tabMysteriousItems);
	}
	
	@Override
	public Item setUnlocalizedName(String name) {
		this.setTextureName("mysteriousloot:"+name);
		GameRegistry.registerItem(this, name);
		return super.setUnlocalizedName(name);
	}

}
