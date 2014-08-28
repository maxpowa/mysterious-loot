package maxpowa.mysteriousloot.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class CustomSpellbookRenderer implements IItemRenderer {
    private static RenderItem renderItem = new RenderItem();

    @Override
    public boolean handleRenderType(ItemStack itemStack, ItemRenderType type) {
            return type == ItemRenderType.INVENTORY;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
                    ItemRendererHelper helper) {
            return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack itemStack, Object... data) {
            FontRenderer fontRenderer = Minecraft.getMinecraft().fontRenderer;
            
            // ====================== Render item texture ======================
            GL11.glPushMatrix();
            GL11.glEnable(GL11.GL_BLEND);
            IIcon icon = itemStack.getIconIndex();
            renderItem.renderIcon(0, 0, icon, 16, 16);
            GL11.glPopMatrix();
            
            // ====================== Render text ======================
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            String text = "";
            if (itemStack.getTagCompound() != null && itemStack.getTagCompound().hasKey("MysteriousLevel"))
            	text = itemStack.getTagCompound().getString("MysteriousLevel");
            boolean unicode = fontRenderer.getUnicodeFlag();
            fontRenderer.setUnicodeFlag(true);
            fontRenderer.drawStringWithShadow(text, 16-fontRenderer.getStringWidth(text), 8, 0x00FFFF);
            fontRenderer.setUnicodeFlag(unicode);
    }
}