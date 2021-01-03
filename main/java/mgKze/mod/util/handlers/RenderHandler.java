package mgKze.mod.util.handlers;

import mgKze.mod.entity.EntitymgKze;
import mgKze.mod.entity.render.RendermgKze;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	public static void registerEntityRenders() {
			RenderingRegistry.registerEntityRenderingHandler(EntitymgKze.class, new IRenderFactory<EntitymgKze>() {
				@Override
				public Render<? super EntitymgKze> createRenderFor(RenderManager manager) {
					return new RendermgKze(manager);
				}
			});
	}
}
