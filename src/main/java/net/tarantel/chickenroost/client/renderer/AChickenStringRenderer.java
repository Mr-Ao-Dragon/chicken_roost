
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenStringEntity;
import net.tarantel.chickenroost.client.model.Modelchicken;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AChickenStringRenderer extends MobRenderer<AChickenStringEntity, Modelchicken<AChickenStringEntity>> {
	public AChickenStringRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchicken(context.bakeLayer(Modelchicken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenStringEntity entity) {
		return new ResourceLocation("chicken_roost:textures/destruction_core_chicken.png");
	}
}
