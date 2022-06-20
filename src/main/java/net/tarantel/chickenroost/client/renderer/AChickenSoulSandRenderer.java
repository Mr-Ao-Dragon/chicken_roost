
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenSoulSandEntity;
import net.tarantel.chickenroost.client.model.Modelchicken;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AChickenSoulSandRenderer extends MobRenderer<AChickenSoulSandEntity, Modelchicken<AChickenSoulSandEntity>> {
	public AChickenSoulSandRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchicken(context.bakeLayer(Modelchicken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenSoulSandEntity entity) {
		return new ResourceLocation("chicken_roost:textures/soularium_chicken.png");
	}
}
