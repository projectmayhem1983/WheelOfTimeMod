package projectmayhem1983.wheeloftime.item;

import net.minecraft.client.stream.Metadata;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFountainta extends Item {
	public ItemFountainta(){
		this.setMaxStackSize(1);
		this.setFull3D();
	}
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){

	return item;
	
		
	}
}
