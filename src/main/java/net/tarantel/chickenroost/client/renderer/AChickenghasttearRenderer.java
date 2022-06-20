
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenghasttearEntity;
import net.tarantel.chickenroost.client.model.Modelchicken;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AChickenghasttearRenderer extends MobRenderer<AChickenghasttearEntity, Modelchicken<AChickenghasttearEntity>> {
	public AChickenghasttearRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchicken(context.bakeLayer(Modelchicken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenghasttearEntity entity) {
		return new ResourceLocation("chicken_roost:textures/ghastchicken.png");
	}
}
