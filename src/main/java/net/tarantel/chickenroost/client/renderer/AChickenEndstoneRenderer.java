
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenEndstoneEntity;
import net.tarantel.chickenroost.client.model.Modelchicken;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AChickenEndstoneRenderer extends MobRenderer<AChickenEndstoneEntity, Modelchicken<AChickenEndstoneEntity>> {
	public AChickenEndstoneRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchicken(context.bakeLayer(Modelchicken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenEndstoneEntity entity) {
		return new ResourceLocation("chicken_roost:textures/bullet_chicken.png");
	}
}
