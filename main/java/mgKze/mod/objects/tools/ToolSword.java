package mgKze.mod.objects.tools;

import mgKze.mod.Main;
import mgKze.mod.init.ItemInit;
import mgKze.mod.util.IHasModel;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{

	public ToolSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.GTWWTab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerModel(this, 0);
	}
}
