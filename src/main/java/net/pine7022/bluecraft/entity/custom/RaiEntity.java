package net.pine7022.bluecraft.entity.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.AbstractGolem;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.level.Level;

public class RaiEntity extends AbstractGolem implements RangedAttackMob {
    public RaiEntity(EntityType<? extends AbstractGolem> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void registerGoals() {
        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 0, 10, 15.0F));
        this.goalSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Mob.class, 10, true, false, p -> p instanceof Enemy));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MOVEMENT_SPEED, 10)
                .add(Attributes.MOVEMENT_SPEED, 0F);
    }

    @Override
    public void performRangedAttack(LivingEntity target, float distanceFactor) {
        {
            AbstractArrow arrow = new Arrow(EntityType.ARROW, this.level());
            double d0 = target.getX() - this.getX();
            double d1 = target.getY(0.33333) - arrow.getY();
            double d2 = target.getZ() - this.getZ();
            double d3 = Math.sqrt(d0 * d0 + d2 * d2);
            arrow.shoot(d0, d1 + d3 * 0.2F, d2, 1.6F, (float) (2));
            this.playSound(SoundEvents.DISPENSER_LAUNCH, 1.0F, 1.0F);
            this.level().addFreshEntity(arrow);

        }
    }
}



