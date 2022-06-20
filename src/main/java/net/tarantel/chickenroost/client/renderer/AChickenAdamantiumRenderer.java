
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenAdamantiumEntity;
import net.tarantel.chickenroost.client.model.Modelchicken;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AChickenAdamantiumRenderer extends MobRenderer<AChickenAdamantiumEntity, Modelchicken<AChickenAdamantiumEntity>> {
	public AChickenAdamantiumRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchicken(context.bakeLayer(Modelchicken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenAdamantiumEntity entity) {
		return new ResourceLocation("chicken_roost:textures/emeradic_crystal_chicken.png");
	}
}
