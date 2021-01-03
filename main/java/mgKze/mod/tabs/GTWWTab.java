package mgKze.mod.tabs;

import mgKze.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GTWWTab extends CreativeTabs{
	public GTWWTab(String label) { 
		super("gtwwtab");
	}

	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.GTWW_LOGO);
	}
}
