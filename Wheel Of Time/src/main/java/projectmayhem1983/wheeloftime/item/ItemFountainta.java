package projectmayhem1983.wheeloftime.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFountainta extends Item {
	public ItemFountainta(){
		this.setMaxStackSize(1);
		this.setFull3D();
	}
private void playSoundAtEntity(String string, float f, float g) {
		
		
	}
public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
  {
       world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

    if (!world.isRemote)
    {
        int par2 = 0;
		int par3 = 0;
		int par4 = 0;
		world.setBlock(par2, par3 - 1, par4, Blocks.flowing_water);
    }

    return item;
}
	
}
