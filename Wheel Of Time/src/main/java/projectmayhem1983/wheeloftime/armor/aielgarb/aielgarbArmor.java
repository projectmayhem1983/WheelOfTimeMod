package projectmayhem1983.wheeloftime.armor.aielgarb;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import projectmayhem1983.wheeloftime.WheelOfTime;

public class aielgarbArmor extends ItemArmor{
	private String[] armourTypes = new String [] {"aielgarbHelm", "aielgarbkChest", "aielgarbLegs", "aielgarbBoots"};
		
	public aielgarbArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
		super(armorMaterial, renderIndex, armourType);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
		if     (stack.getItem() == (WheelOfTime.aielgarbHelm) || 
				stack.getItem() == (WheelOfTime.aielgarbChest)||
				stack.getItem() == (WheelOfTime.aielgarbBoots)){
			return "wot:textures/models/armor/aielgarb1.png";
		}
		if     (stack.getItem().equals(WheelOfTime.aielgarbLegs)){
			return "wot:textures/models/armor/aielgarb2.png";
		}
		else return null;
		}
		
	}
	

