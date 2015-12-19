package projectmayhem1983.wheeloftime.entities.mobs;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import projectmayhem1983.wheeloftime.biome.BiomeGenBlight;
import projectmayhem1983.wheeloftime.entities.mobs.EntityAielMob;

public class EntityAiel {
	public static void WheelOfTime(){
		registerEntity();
	}
	public static void registerEntity(){
		
		createEntity(EntityAielMob.class,"Aiel Mob",0x007203, 0x0E9B0D);
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId,"wot", 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 6, 2, 3, EnumCreatureType.monster, new BiomeGenBase[]{BiomeGenBase.desert,BiomeGenBase.desertHills});
		
		createEgg(randomId, solidColor, spotColor);
		
	}

	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}
}
