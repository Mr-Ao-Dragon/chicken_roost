
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenCharCoalEntity;
import net.tarantel.chickenroost.client.model.Modelchicken;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AChickenCharCoalRenderer extends MobRenderer<AChickenCharCoalEntity, Modelchicken<AChickenCharCoalEntity>> {
	public AChickenCharCoalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchicken(context.bakeLayer(Modelchicken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenCharCoalEntity entity) {
		return new ResourceLocation("chicken_roost:textures/coalchicken.png");
	}
}
