package mgKze.mod.init;

import mgKze.mod.Main;
import mgKze.mod.entity.EntitymgKze;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
	
	private static int nextID = 0;
	
	public static void registerEntities() {
		registerEntity(EntitymgKze.class, "mgKze", 80);
		registerEntityEgg(new ResourceLocation(Main.MODID + ":" + "mgKze"), 0xffff00, 0xc0ff3e);
	}
	
	private static void registerEntity(Class<? extends Entity> entityClass, String name, int range) {
		EntityRegistry.registerModEntity(new ResourceLocation(Main.MODID + ":" + name), entityClass, name, nextID++, Main.instance, range, 3, true);
		
	}
	
	private static void registerEntityEgg(ResourceLocation location, int eggPrimary, int eggSecondary)
    {
        EntityRegistry.registerEgg(location, eggPrimary, eggSecondary);
    }
}
