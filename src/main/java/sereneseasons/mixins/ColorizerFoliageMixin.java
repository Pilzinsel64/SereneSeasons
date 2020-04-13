package sereneseasons.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.ColorizerFoliage;
import sereneseasons.asm.IBiomeMixin;

@Mixin(ColorizerFoliage.class)
public abstract class ColorizerFoliageMixin implements IBiomeMixin
{
    @Shadow
    protected static int[] foliageBuffer;

    /**
     * @author darkshadow44
     * @reason Twilight forest really doesn't like negative temperature/humidity...
     */
    @Overwrite
    @SideOnly(Side.CLIENT)
    public static int getFoliageColor(double p_77470_0_, double p_77470_2_)
    {
        p_77470_2_ *= p_77470_0_;

        p_77470_0_ = Math.min(1, p_77470_0_);
        p_77470_0_ = Math.max(0, p_77470_0_);

        p_77470_2_ = Math.min(1, p_77470_2_);
        p_77470_2_ = Math.max(0, p_77470_2_);

        int i = (int) ((1.0D - p_77470_0_) * 255.0D);
        int j = (int) ((1.0D - p_77470_2_) * 255.0D);
        return foliageBuffer[j << 8 | i];
    }
}
