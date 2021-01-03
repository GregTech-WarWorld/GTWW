package mgKze.mod.entity.render;

import mgKze.mod.Main;
import mgKze.mod.entity.EntitymgKze;
import mgKze.mod.entity.model.ModelmgKze;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RendermgKze extends RenderLiving<EntitymgKze>{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Main.MODID + ":textures/entity/mgKze.png");
	
	public RendermgKze(RenderManager manager) {
		super(manager, new ModelmgKze(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntitymgKze entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntitymgKze entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
