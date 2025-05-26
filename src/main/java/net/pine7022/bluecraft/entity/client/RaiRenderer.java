package net.pine7022.bluecraft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.pine7022.bluecraft.BlueCraft;
import net.pine7022.bluecraft.entity.custom.RaiEntity;

public class RaiRenderer extends MobRenderer<RaiEntity, RaiModel<RaiEntity>> {


    public RaiRenderer(EntityRendererProvider.Context context) {
        super(context, new RaiModel<>(context.bakeLayer(RaiModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(RaiEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BlueCraft.MODID, "textures/entity/rai.png");
    }

    @Override
    public void render(RaiEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
