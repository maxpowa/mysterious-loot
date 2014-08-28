package maxpowa.mysteriousloot.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ExtraItems {

	public static CreativeTabs tabExtraItems = (new CreativeTabs("extraItems") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return ExtraItems.uselessBook;
		}
		
		@Override
		public boolean hasSearchBar() {
			return true;
		}
	}).setBackgroundImageName("item_search.png");

	public static ItemUselessBook uselessBook;
	public static ItemBasicRapier basicRapier;

	public static void init() {
		uselessBook = new ItemUselessBook();
		basicRapier = new ItemBasicRapier();
	}

}