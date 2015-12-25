package projectmayhem1983.wheeloftime.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import projectmayhem1983.wheeloftime.WheelOfTime;
import projectmayhem1983.wheeloftime.blocks.BlockCuendillar;
import projectmayhem1983.wheeloftime.blocks.BlockPowerore;
import projectmayhem1983.wheeloftime.crops.BlockIcePeppers;
import projectmayhem1983.wheeloftime.crops.BlockKafBush;

public class WheelOfTimeBlocks {

	// Blocks
	public static Block blockCuendillar;
	public static Block blockPowerore;

	// plants
	public static Block blockIcePeppers;
	public static Block blockKafBush;

	public static void init() {

		// Blocks
		blockCuendillar = new BlockCuendillar(Material.iron).setBlockName("BlockCuendillar")
				.setBlockTextureName("wot:blockcuendillar").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerBlock(blockCuendillar, blockCuendillar.getUnlocalizedName().substring(5));

		blockPowerore = new BlockPowerore(Material.iron).setBlockName("BlockPowerore")
				.setBlockTextureName("wot:blockpowerore").setCreativeTab(WheelOfTime.tabWheelOfTime);
		GameRegistry.registerBlock(blockPowerore, blockPowerore.getUnlocalizedName().substring(5));

		// Plants
		blockIcePeppers = new BlockIcePeppers().setBlockName("BlockIcePeppers").setBlockTextureName("wot:icepepperplant7");
		GameRegistry.registerBlock(blockIcePeppers, blockIcePeppers.getUnlocalizedName().substring(5));
		
		blockKafBush = new BlockKafBush().setBlockName("BlockKafBush").setBlockTextureName("wot:defaultplant0");
		GameRegistry.registerBlock(blockKafBush, blockKafBush.getUnlocalizedName().substring(5));

	}

}
