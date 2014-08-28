package maxpowa.extrathings.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ItemUselessBook extends BaseItem {
	
	public ItemUselessBook() {
		super();
		this.setMaxStackSize(1);
		this.setUnlocalizedName("uselessBook");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        return stack;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List text, boolean p_77624_4_) {
		text.add("This book doesn't appear to be completely useless...");
	}

}
