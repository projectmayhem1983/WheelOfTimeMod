package projectmayhem1983.wheeloftime.biome;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import projectmayhem1983.wheeloftime.entities.mobs.EntityTrolloc;

public class BiomeGenBlight extends BiomeGenBase{
	
	public BiomeGenBlight(int id){
		super(id);
		
		this.theBiomeDecorator.deadBushPerChunk = 10;
		this.spawnableMonsterList.add(new SpawnListEntry(EntityTrolloc.class, 5,2,10));
		this.theBiomeDecorator.mushroomsPerChunk = 2;
		this.topBlock = Blocks.mycelium;
		this.fillerBlock = Blocks.soul_sand;
	}

}
