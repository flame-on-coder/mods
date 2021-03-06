package betterbreeds.entity.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import betterbreeds.entity.EntitySheep4;

public class RenderSheep4 extends RenderLiving
{
	
	private static final ResourceLocation texture = new ResourceLocation("textures/entity/sheep/sheep.png");

	protected ResourceLocation func_110919_a(EntitySheep4 par1EntityChicken)
	{
		return texture;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return this.func_110919_a((EntitySheep4)par1Entity);
	}
	
    public RenderSheep4(ModelBase par1ModelBase, ModelBase par2ModelBase, float par3)
    {
        super(par1ModelBase, par3);
        this.setRenderPassModel(par2ModelBase);
    }

    protected int setWoolColorAndRender(EntitySheep4 par1EntitySheep, int par2, float par3)
    {
        if (par2 == 0 && !par1EntitySheep.getSheared())
        {
        	this.bindTexture(new ResourceLocation("subaraki:BB/scotish.png"));
            float var4 = 1.0F;
            int var5 = par1EntitySheep.getFleeceColor();
            GL11.glColor3f(var4 * EntitySheep4.fleeceColorTable[var5][0], var4 * EntitySheep4.fleeceColorTable[var5][1], var4 * EntitySheep4.fleeceColorTable[var5][2]);
            return 1;
        }
        else
        {
            return -1;
        }
    }

    public void doRenderSheep(EntitySheep4 par1EntitySheep, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntitySheep, par2, par4, par6, par8, par9);
        
    }

    /**
     * Queries whether should render the specified pass or not.
     */@Override
    protected int shouldRenderPass(EntityLivingBase par1EntityLiving, int par2, float par3)
    {
        return this.setWoolColorAndRender((EntitySheep4)par1EntityLiving, par2, par3);
    }
     @Override
    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.doRenderSheep((EntitySheep4)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */@Override
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.doRenderSheep((EntitySheep4)par1Entity, par2, par4, par6, par8, par9);
    }
}
