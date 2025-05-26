package net.pine7022.bluecraft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.pine7022.bluecraft.BlueCraft;
import net.pine7022.bluecraft.entity.custom.RaiEntity;

public class RaiModel<T extends RaiEntity> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(BlueCraft.MODID, "rai"), "main");
    private ModelPart body;
    private ModelPart head;

    public RaiModel(ModelPart root) {
        this.body = root.getChild("body");
        this.head = root.getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Left_Leg = partdefinition.addOrReplaceChild("Left_Leg", CubeListBuilder.create().texOffs(30, 22).addBox(5.0F, -2.0F, -5.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(28, 65).addBox(5.0F, -8.1284F, 0.1423F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 52).addBox(5.5F, -4.0F, -3.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(60, 0).addBox(5.5F, -6.0F, -1.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 24.0F, 0.0F));

        PartDefinition cube_r1 = Left_Leg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 42).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -1.4805F, -2.8251F, 0.8727F, 0.0F, 0.0F));

        PartDefinition Right_leg = partdefinition.addOrReplaceChild("Right_leg", CubeListBuilder.create().texOffs(30, 33).addBox(5.0F, -2.0F, -5.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(54, 70).addBox(5.0F, -8.1284F, 0.1423F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(21, 54).addBox(5.5F, -4.0F, -3.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(61, 54).addBox(5.5F, -6.0F, -1.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.5F, 24.0F, 0.0F));

        PartDefinition cube_r2 = Right_leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 44).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -1.4805F, -2.8251F, 0.8727F, 0.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(44, 44).addBox(-3.0F, 5.4083F, -7.6613F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(54, 31).addBox(-3.0F, -2.2214F, -5.2557F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(54, 41).addBox(-1.0F, -3.5917F, -1.6613F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 11.5917F, 2.6613F));

        PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 63).addBox(-3.0F, -2.0F, -1.0F, 5.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 54).addBox(-4.0F, -2.0F, -1.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.7786F, -5.2557F, -0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 12).addBox(-3.0F, -2.0F, -1.0F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.056F, -5.4532F, 1.2654F, 0.0F, 0.0F));

        PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 18).addBox(-3.0F, -2.0F, -1.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 8.4083F, -1.6613F, -0.3927F, 0.0F, 0.0F));

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(56, 12).addBox(-2.5891F, -1.0F, -2.0398F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(66, 41).addBox(-3.5891F, -1.0F, -3.0398F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(14, 65).addBox(-3.5891F, -2.0F, -2.0398F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(40, 64).addBox(2.4109F, -1.0F, -3.0398F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(60, 63).addBox(2.4109F, -2.0F, -2.0398F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(54, 22).addBox(-2.5891F, -4.0F, -1.0398F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(66, 48).addBox(-1.5891F, -5.0F, 0.9602F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0F, 1.0F, -0.0002F, -0.0001F, 0.0038F));

        PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 71).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(66, 70).addBox(4.0F, -2.0F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5891F, -3.0F, 3.9602F, -0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1963F, -2.2544F, -6.0398F, 0.0F, 0.0F, -0.6109F));

        PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3799F, -3.4016F, -6.0398F, 0.0F, 0.0F, 0.6109F));

        PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -1.0F, -11.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5891F, -2.0F, -1.0398F, 0.0F, 0.0F, 0.7854F));

        PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -1.0F, -11.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4109F, -2.0F, -1.0398F, 0.0F, 0.0F, 0.7854F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(RaiEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw,headPitch);

    }

    private void applyHeadRotation(float netHeadYaw, float headPitch) {
        netHeadYaw = Mth.clamp(netHeadYaw, -90.0F, 90.0F);
        headPitch = Mth.clamp(headPitch, -90.0F, 90.0F);
        this.head.yRot = netHeadYaw * Mth.DEG_TO_RAD;
        this.head.xRot = headPitch * Mth.DEG_TO_RAD;
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        head.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public ModelPart root() {
        return body;
    }

}




