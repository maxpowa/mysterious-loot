package maxpowa.mysteriousloot.items;

import java.util.List;

import com.google.common.collect.Multimap;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ItemBasicAxe extends BaseItem {
	
	public ItemBasicAxe() {
		super();
		this.setFull3D();
		this.setMaxStackSize(1);
		this.setMaxDamage(54);
		this.setUnlocalizedName("basicAxe");
	}

	@Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase player)
    {
        stack.damageItem(1, player);
        return true;
    }

	@Override
    public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z, EntityLivingBase player)
    {
        if ((double)block.getBlockHardness(world, x, y, z) != 0.0D)
        {
            stack.damageItem(2, player);
        }

        return true;
    }
	
	@Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.block;
    }
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Multimap getAttributeModifiers(ItemStack stack)
    {
        Multimap multimap = super.getAttributeModifiers(stack);
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", 3, 0));
        return multimap;
    }
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List text, boolean p_77624_4_) {
		text.add("An old, dull battleaxe.");
		if (this.getMaxDamage()-stack.getItemDamage() < 15) {
			text.add("It's falling apart...");
		}
	}

}
