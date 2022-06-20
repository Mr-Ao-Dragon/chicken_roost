
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenVibraniumEntity;
import net.tarantel.chickenroost.client.model.Modelchicken;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AChickenVibraniumRenderer extends MobRenderer<AChickenVibraniumEntity, Modelchicken<AChickenVibraniumEntity>> {
	public AChickenVibraniumRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchicken(context.bakeLayer(Modelchicken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenVibraniumEntity entity) {
		return new ResourceLocation("chicken_roost:textures/vibrant_alloy_chicken.png");
	}
}
