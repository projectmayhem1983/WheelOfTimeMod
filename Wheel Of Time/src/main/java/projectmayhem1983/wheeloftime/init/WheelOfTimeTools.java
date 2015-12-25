package projectmayhem1983.wheeloftime.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import projectmayhem1983.wheeloftime.WheelOfTime;
import projectmayhem1983.wheeloftime.item.ItemPowerAxe;
import projectmayhem1983.wheeloftime.item.ItemPowerHoe;
import projectmayhem1983.wheeloftime.item.ItemPowerPickaxe;
import projectmayhem1983.wheeloftime.item.ItemPowerShovel;
import projectmayhem1983.wheeloftime.item.ItemPowerSword;
import projectmayhem1983.wheeloftime.item.ItemSpear;

public class WheelOfTimeTools {

	// Tools
	public static Item powerPickaxe;
	public static Item powerAxe;
	public static Item powerShovel;
	public static Item powerHoe;

	// Weapons
	public static Item powerSword;
	public static Item spear;

	public static void init() {

		// Tools

		powerPickaxe = new ItemPowerPickaxe(WheelOfTime.cuendillarToolMaterial).setUnlocalizedName("ItemPowerPickaxe")
				.setTextureName("wot:itemcuendillarpickaxe").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(powerPickaxe, powerPickaxe.getUnlocalizedName().substring(5));

		powerAxe = new ItemPowerAxe(WheelOfTime.cuendillarToolMaterial).setUnlocalizedName("ItemPowerAxe")
				.setTextureName("wot:itemcuendillaraxe").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(powerAxe, powerAxe.getUnlocalizedName().substring(5));

		powerShovel = new ItemPowerShovel(WheelOfTime.cuendillarToolMaterial).setUnlocalizedName("ItemPowerShovel")
				.setTextureName("wot:itemcuendillarshovel").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(powerShovel, powerShovel.getUnlocalizedName().substring(5));

		powerHoe = new ItemPowerHoe(WheelOfTime.cuendillarToolMaterial).setUnlocalizedName("ItemPowerHoe")
				.setTextureName("wot:itemcuendillarhoe").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(powerHoe, powerHoe.getUnlocalizedName().substring(5));

		// Weapons

		powerSword = new ItemPowerSword(WheelOfTime.cuendillarToolMaterial).setUnlocalizedName("ItemPowerSword")
				.setTextureName("wot:itemcuendillarsword").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(powerSword, powerSword.getUnlocalizedName().substring(5));

		spear = new ItemSpear(WheelOfTime.ironToolMaterial).setUnlocalizedName("ItemSpear").setTextureName("wot:itemspear")
				.setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerItem(spear, spear.getUnlocalizedName().substring(5));
	}

}
