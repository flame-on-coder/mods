package redstone.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGatling extends ModelBase
{
	ModelRenderer Left_base;
	ModelRenderer top_left_barrel;
	ModelRenderer top_barrel;
	ModelRenderer bottom_barrel;
	ModelRenderer bottom_left_barrel;
	ModelRenderer front_top_middle_ring;
	ModelRenderer bottom_right_barrel;
	ModelRenderer top_right_barrel;
	ModelRenderer front_top_left_ring;
	ModelRenderer back_bottom_left_ring;
	ModelRenderer front_bottom_left_ring;
	ModelRenderer front_top_right_ring;
	ModelRenderer front_bottom_right_ring;
	ModelRenderer front_middle_left_ring;
	ModelRenderer front_bottom_middle_ring;
	ModelRenderer front_middle_right_ring;
	ModelRenderer back_bottom_right_ring;
	ModelRenderer back_top_right_ring;
	ModelRenderer back_top_left_ring;
	ModelRenderer back_middle_right_ring;
	ModelRenderer back_middle_left_ring;
	ModelRenderer left_shield;
	ModelRenderer shield;
	ModelRenderer right_shield;
	ModelRenderer base;
	ModelRenderer base_right;

	public ModelGatling()
	{
		textureWidth = 64;
		textureHeight = 32;

		textureWidth = 37;
		textureHeight = 75;

		Left_base = new ModelRenderer(this, 25, 0);
		Left_base.addBox(0F, 0F, 0F, 1, 3, 5);
		Left_base.setRotationPoint(5F, 1F, 1F);
		Left_base.setTextureSize(37, 75);
		Left_base.mirror = true;
		setRotation(Left_base, 0F, 0F, 0F);
		top_left_barrel = new ModelRenderer(this, 0, 57);
		top_left_barrel.addBox(0F, 0F, -14F, 1, 1, 16);
		top_left_barrel.setRotationPoint(4F, 1F, -3F);
		top_left_barrel.setTextureSize(37, 75);
		top_left_barrel.mirror = true;
		setRotation(top_left_barrel, 0F, 0F, 0F);
		top_barrel = new ModelRenderer(this, 0, 57);
		top_barrel.addBox(0F, 0F, -14F, 1, 1, 16);
		top_barrel.setRotationPoint(2F, 0F, -3F);
		top_barrel.setTextureSize(37, 75);
		top_barrel.mirror = true;
		setRotation(top_barrel, 0F, 0F, 0F);
		bottom_barrel = new ModelRenderer(this, 0, 57);
		bottom_barrel.addBox(0F, 0F, -14F, 1, 1, 16);
		bottom_barrel.setRotationPoint(2F, 4F, -3F);
		bottom_barrel.setTextureSize(37, 75);
		bottom_barrel.mirror = true;
		setRotation(bottom_barrel, 0F, 0F, 0F);
		bottom_left_barrel = new ModelRenderer(this, 0, 57);
		bottom_left_barrel.addBox(0F, 0F, -14F, 1, 1, 16);
		bottom_left_barrel.setRotationPoint(4F, 3F, -3F);
		bottom_left_barrel.setTextureSize(37, 75);
		bottom_left_barrel.mirror = true;
		setRotation(bottom_left_barrel, 0F, 0F, 0F);
		front_top_middle_ring = new ModelRenderer(this, 0, 38);
		front_top_middle_ring.addBox(0F, 0F, -14F, 1, 1, 1);
		front_top_middle_ring.setRotationPoint(2F, 1F, -2F);
		front_top_middle_ring.setTextureSize(37, 75);
		front_top_middle_ring.mirror = true;
		setRotation(front_top_middle_ring, 0F, 0F, 0F);
		bottom_right_barrel = new ModelRenderer(this, 0, 57);
		bottom_right_barrel.addBox(0F, 0F, -14F, 1, 1, 16);
		bottom_right_barrel.setRotationPoint(0F, 3F, -3F);
		bottom_right_barrel.setTextureSize(37, 75);
		bottom_right_barrel.mirror = true;
		setRotation(bottom_right_barrel, 0F, 0F, 0F);
		top_right_barrel = new ModelRenderer(this, 0, 57);
		top_right_barrel.addBox(0F, 0F, -14F, 1, 1, 16);
		top_right_barrel.setRotationPoint(0F, 1F, -3F);
		top_right_barrel.setTextureSize(37, 75);
		top_right_barrel.mirror = true;
		setRotation(top_right_barrel, 0F, 0F, 0F);
		front_top_left_ring = new ModelRenderer(this, 0, 34);
		front_top_left_ring.addBox(0F, 0F, -14F, 1, 2, 1);
		front_top_left_ring.setRotationPoint(3F, 0F, -2F);
		front_top_left_ring.setTextureSize(37, 75);
		front_top_left_ring.mirror = true;
		setRotation(front_top_left_ring, 0F, 0F, 0F);
		back_bottom_left_ring = new ModelRenderer(this, 0, 29);
		back_bottom_left_ring.addBox(0F, 0F, -14F, 1, 1, 2);
		back_bottom_left_ring.setRotationPoint(3F, 4F, 6F);
		back_bottom_left_ring.setTextureSize(37, 75);
		back_bottom_left_ring.mirror = true;
		setRotation(back_bottom_left_ring, 0F, 0F, 0F);
		front_bottom_left_ring = new ModelRenderer(this, 0, 34);
		front_bottom_left_ring.addBox(0F, 0F, -14F, 1, 2, 1);
		front_bottom_left_ring.setRotationPoint(3F, 3F, -2F);
		front_bottom_left_ring.setTextureSize(37, 75);
		front_bottom_left_ring.mirror = true;
		setRotation(front_bottom_left_ring, 0F, 0F, 0F);
		front_top_right_ring = new ModelRenderer(this, 0, 34);
		front_top_right_ring.addBox(0F, 0F, -14F, 1, 2, 1);
		front_top_right_ring.setRotationPoint(1F, 0F, -2F);
		front_top_right_ring.setTextureSize(37, 75);
		front_top_right_ring.mirror = true;
		setRotation(front_top_right_ring, 0F, 0F, 0F);
		front_bottom_right_ring = new ModelRenderer(this, 0, 34);
		front_bottom_right_ring.addBox(0F, 0F, -14F, 1, 2, 1);
		front_bottom_right_ring.setRotationPoint(1F, 3F, -2F);
		front_bottom_right_ring.setTextureSize(37, 75);
		front_bottom_right_ring.mirror = true;
		setRotation(front_bottom_right_ring, 0F, 0F, 0F);
		front_middle_left_ring = new ModelRenderer(this, 0, 38);
		front_middle_left_ring.addBox(0F, 0F, -14F, 2, 1, 1);
		front_middle_left_ring.setRotationPoint(3F, 2F, -2F);
		front_middle_left_ring.setTextureSize(37, 75);
		front_middle_left_ring.mirror = true;
		setRotation(front_middle_left_ring, 0F, 0F, 0F);
		front_bottom_middle_ring = new ModelRenderer(this, 0, 38);
		front_bottom_middle_ring.addBox(0F, 0F, -14F, 1, 1, 1);
		front_bottom_middle_ring.setRotationPoint(2F, 3F, -2F);
		front_bottom_middle_ring.setTextureSize(37, 75);
		front_bottom_middle_ring.mirror = true;
		setRotation(front_bottom_middle_ring, 0F, 0F, 0F);
		front_middle_right_ring = new ModelRenderer(this, 0, 38);
		front_middle_right_ring.addBox(0F, 0F, -14F, 2, 1, 1);
		front_middle_right_ring.setRotationPoint(0F, 2F, -2F);
		front_middle_right_ring.setTextureSize(37, 75);
		front_middle_right_ring.mirror = true;
		setRotation(front_middle_right_ring, 0F, 0F, 0F);
		back_bottom_right_ring = new ModelRenderer(this, 0, 29);
		back_bottom_right_ring.addBox(0F, 0F, -14F, 1, 1, 2);
		back_bottom_right_ring.setRotationPoint(1F, 4F, 6F);
		back_bottom_right_ring.setTextureSize(37, 75);
		back_bottom_right_ring.mirror = true;
		setRotation(back_bottom_right_ring, 0F, 0F, 0F);
		back_top_right_ring = new ModelRenderer(this, 0, 29);
		back_top_right_ring.addBox(0F, 0F, -14F, 1, 1, 2);
		back_top_right_ring.setRotationPoint(1F, 0F, 6F);
		back_top_right_ring.setTextureSize(37, 75);
		back_top_right_ring.mirror = true;
		setRotation(back_top_right_ring, 0F, 0F, 0F);
		back_top_left_ring = new ModelRenderer(this, 0, 29);
		back_top_left_ring.addBox(0F, 0F, -14F, 1, 1, 2);
		back_top_left_ring.setRotationPoint(3F, 0F, 6F);
		back_top_left_ring.setTextureSize(37, 75);
		back_top_left_ring.mirror = true;
		setRotation(back_top_left_ring, 0F, 0F, 0F);
		back_middle_right_ring = new ModelRenderer(this, 0, 29);
		back_middle_right_ring.addBox(0F, 0F, -14F, 1, 1, 2);
		back_middle_right_ring.setRotationPoint(0F, 2F, 6F);
		back_middle_right_ring.setTextureSize(37, 75);
		back_middle_right_ring.mirror = true;
		setRotation(back_middle_right_ring, 0F, 0F, 0F);
		back_middle_left_ring = new ModelRenderer(this, 0, 29);
		back_middle_left_ring.addBox(0F, 0F, -14F, 1, 1, 2);
		back_middle_left_ring.setRotationPoint(4F, 2F, 6F);
		back_middle_left_ring.setTextureSize(37, 75);
		back_middle_left_ring.mirror = true;
		setRotation(back_middle_left_ring, 0F, 0F, 0F);
		left_shield = new ModelRenderer(this, 23, 19);
		left_shield.addBox(0F, 0F, 0F, 1, 5, 1);
		left_shield.setRotationPoint(5F, 0F, -1F);
		left_shield.setTextureSize(37, 75);
		left_shield.mirror = true;
		setRotation(left_shield, 0F, 0F, 0F);
		shield = new ModelRenderer(this, 0, 16);
		shield.addBox(0F, 0F, 0F, 5, 7, 1);
		shield.setRotationPoint(0F, -1F, -1F);
		shield.setTextureSize(37, 75);
		shield.mirror = true;
		setRotation(shield, 0F, 0F, 0F);
		right_shield = new ModelRenderer(this, 23, 19);
		right_shield.addBox(0F, 0F, 0F, 1, 5, 1);
		right_shield.setRotationPoint(-1F, 0F, -1F);
		right_shield.setTextureSize(37, 75);
		right_shield.mirror = true;
		setRotation(right_shield, 0F, 0F, 0F);
		base = new ModelRenderer(this, 0, 0);
		base.addBox(0F, 0F, 0F, 5, 5, 6);
		base.setRotationPoint(0F, 0F, 0F);
		base.setTextureSize(37, 75);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		base_right = new ModelRenderer(this, 25, 0);
		base_right.addBox(0F, 0F, 0F, 1, 3, 5);
		base_right.setRotationPoint(-1F, 1F, 1F);
		base_right.setTextureSize(37, 75);
		base_right.mirror = true;
		setRotation(base_right, 0F, 0F, 0F);  }

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Left_base.render(f5);
	    top_left_barrel.render(f5);
	    top_barrel.render(f5);
	    bottom_barrel.render(f5);
	    bottom_left_barrel.render(f5);
	    front_top_middle_ring.render(f5);
	    bottom_right_barrel.render(f5);
	    top_right_barrel.render(f5);
	    front_top_left_ring.render(f5);
	    back_bottom_left_ring.render(f5);
	    front_bottom_left_ring.render(f5);
	    front_top_right_ring.render(f5);
	    front_bottom_right_ring.render(f5);
	    front_middle_left_ring.render(f5);
	    front_bottom_middle_ring.render(f5);
	    front_middle_right_ring.render(f5);
	    back_bottom_right_ring.render(f5);
	    back_top_right_ring.render(f5);
	    back_top_left_ring.render(f5);
	    back_middle_right_ring.render(f5);
	    back_middle_left_ring.render(f5);
	    left_shield.render(f5);
	    shield.render(f5);
	    right_shield.render(f5);
	    base.render(f5);
	    base_right.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}