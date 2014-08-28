package maxpowa.extrathings.items;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class BaseItem extends Item {
	
	public BaseItem() {
		super();
		this.setCreativeTab(ExtraItems.tabExtraItems);
	}
	
	@Override
	public Item setUnlocalizedName(String name) {
		this.setTextureName("extrathings:"+name);
		GameRegistry.registerItem(this, name);
		return super.setUnlocalizedName(name);
	}

}
