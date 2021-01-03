package mgKze.mod.entity;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.world.World;

public class EntitymgKze extends EntityZombie{

	public EntitymgKze(World worldIn) {
		super(worldIn);
	}
	
	@Override
	protected boolean shouldBurnInDay() {
		return false;
	}
	
	
}
