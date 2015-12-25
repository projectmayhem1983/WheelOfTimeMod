package projectmayhem1983.wheeloftime.biome;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import projectmayhem1983.wheeloftime.entities.mobs.Shadowhound.EntityDarkhound;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.EntityTrolloc;

public class BiomeGenBlight extends BiomeGenBase{
	
	public BiomeGenBlight(int id){
		super(id);
		
		this.theBiomeDecorator.deadBushPerChunk = 10;
		this.spawnableMonsterList.add(new SpawnListEntry(EntityTrolloc.class, 5,2,10));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityDarkhound.class,5,2,10));
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.theBiomeDecorator.mushroomsPerChunk = 2;
		this.topBlock = Blocks.grass;
		this.fillerBlock = Blocks.dirt;
		this.waterColorMultiplier = 0xACFCD7;
		this.getModdedBiomeGrassColor(0x968E6B);
	}
	 
}
