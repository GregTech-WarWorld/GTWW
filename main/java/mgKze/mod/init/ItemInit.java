package mgKze.mod.init;

import java.util.ArrayList;
import java.util.List;

import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;
import mgKze.mod.Main;
import mgKze.mod.objects.armour.ArmourBase;
import mgKze.mod.objects.items.ItemBase;
import mgKze.mod.objects.tools.ToolAxe;
import mgKze.mod.objects.tools.ToolHoe;
import mgKze.mod.objects.tools.ToolPickaxe;
import mgKze.mod.objects.tools.ToolShovel;
import mgKze.mod.objects.tools.ToolSword;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//GTWWLOGO
	public static final Item GTWW_LOGO = new ItemBase("logo_gtww");
	
	//MATERIALS
	public static final ToolMaterial TOOL_GREGTECUM = EnumHelper.addToolMaterial("tool_gregtecum", 10, 1919810, 24.0F, 16.0F, 22);
	public static final ArmorMaterial ARMOUR_GREGTECUM = EnumHelper.addArmorMaterial("armour_gregtecum", Main.MODID + ":gregtecum", 114, new int[]{5,8,10,7}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 8.0F);

	//ITEMS
	public static final Item INGOT_GREGTECUM = new ItemBase("ingot_gregtecum");
	public static final Item FOIL_GREGTECUM = new ItemBase("foil_gregtecum");
	
	//STRANGE THING
	public static final Item XX = new ItemBase("slimes_favorite_thing");
	
	//TOOLS
	public static final Item AXE_GREGTECUM = new ToolAxe("axe_gregtecum", TOOL_GREGTECUM);
	public static final Item HOE_GREGTECUM = new ToolHoe("hoe_gregtecum", TOOL_GREGTECUM);
	public static final Item PICKAXE_GREGTECUM = new ToolPickaxe("pickaxe_gregtecum", TOOL_GREGTECUM);
	public static final Item SHOVEL_GREGTECUM = new ToolShovel("shovel_gregtecum", TOOL_GREGTECUM);
	public static final Item SWORD_GREGTECUM = new ToolSword("sword_gregtecum", TOOL_GREGTECUM);
	
	//ARMOURS
	public static final Item HELMET_GREGTECUM = new ArmourBase("helmet_gregtecum", ARMOUR_GREGTECUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_GREGTECUM = new ArmourBase("chestplate_gregtecum", ARMOUR_GREGTECUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_GREGTECUM = new ArmourBase("leggings_gregtecum", ARMOUR_GREGTECUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_GREGTECUM = new ArmourBase("boots_gregtecum", ARMOUR_GREGTECUM, 1, EntityEquipmentSlot.FEET);
}
