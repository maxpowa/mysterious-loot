package maxpowa.mysteriousloot.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MysteriousItems {

	public static CreativeTabs tabMysteriousItems = (new CreativeTabs("mysteriousItems") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return MysteriousItems.uselessBook;
		}
		
		@Override
		public boolean hasSearchBar() {
			return true;
		}
		
		@Override
		public int getSearchbarWidth() {
			return 71;
		}
	}).setBackgroundImageName("mysterious_loot.png");

	public static ItemUselessBook uselessBook;
	public static ItemBasicRapier basicRapier;

	public static void init() {
		uselessBook = new ItemUselessBook();
		basicRapier = new ItemBasicRapier();
	}

}
