
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenElectrumEntity;
import net.tarantel.chickenroost.client.model.Modelchicken;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AChickenElectrumRenderer extends MobRenderer<AChickenElectrumEntity, Modelchicken<AChickenElectrumEntity>> {
	public AChickenElectrumRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchicken(context.bakeLayer(Modelchicken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenElectrumEntity entity) {
		return new ResourceLocation("chicken_roost:textures/electrum_chicken.png");
	}
}
