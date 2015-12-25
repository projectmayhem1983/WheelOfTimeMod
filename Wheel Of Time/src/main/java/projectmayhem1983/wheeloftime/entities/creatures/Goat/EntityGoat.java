package projectmayhem1983.wheeloftime.entities.creatures.Goat;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityGoat {
	public static void WheelOfTime(){
		registerEntity();
	}
	public static void registerEntity(){
		
		createEntity(EntityGoatMob.class,"Goat Mob",0xF212A2, 0xA19821);
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId,"wot", 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 10, 2, 4, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.beach, BiomeGenBase.birchForest,BiomeGenBase.birchForestHills,
				BiomeGenBase.birchForestHills,BiomeGenBase.coldBeach,BiomeGenBase.coldTaiga,BiomeGenBase.coldTaigaHills,BiomeGenBase.extremeHills,BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.extremeHillsPlus,BiomeGenBase.forest,BiomeGenBase.forestHills,BiomeGenBase.jungle,BiomeGenBase.mesa,BiomeGenBase.taiga,BiomeGenBase.swampland,
				BiomeGenBase.roofedForest,BiomeGenBase.plains});
		
		
		createEgg(randomId, solidColor, spotColor);
		
	}

	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}
}
