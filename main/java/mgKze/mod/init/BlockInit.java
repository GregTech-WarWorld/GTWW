package mgKze.mod.init;

import java.util.ArrayList;
import java.util.List;
import mgKze.mod.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block GTWW_BLOCK = new BlockBase("block_gtww", Material.IRON);
	public static final Block GREGTECUM_BLOCK = new BlockBase("block_gregtecum", Material.IRON);
}
