package projectmayhem1983.wheeloftime.armor.whitecloak;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import projectmayhem1983.wheeloftime.WheelOfTime;

public class whitecloakArmor extends ItemArmor{
	private String[] armourTypes = new String [] {"whitecloakHelm", "whitecloakChest", "whitecloakLegs", "whitecloakBoots"};
		
	public whitecloakArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
		super(armorMaterial, renderIndex, armourType);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
		if     (stack.getItem() == (WheelOfTime.whitecloakHelm) || 
				stack.getItem() == (WheelOfTime.whitecloakChest)||
				stack.getItem() == (WheelOfTime.whitecloakBoots)){
			return "wot:textures/models/armor/whitecloak1.png";
		}
		if     (stack.getItem().equals(WheelOfTime.whitecloakLegs)){
			return "wot:textures/models/armor/whitecloak2.png";
		}
		else return null;
		}
		
	}
	
