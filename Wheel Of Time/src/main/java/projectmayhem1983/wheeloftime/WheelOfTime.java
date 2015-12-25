package projectmayhem1983.wheeloftime;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import projectmayhem1983.wheeloftime.AngrealEventHandlers.AngelEventHandler;
import projectmayhem1983.wheeloftime.biome.BiomeRegistry;
import projectmayhem1983.wheeloftime.biome.WorldTypeWheelOfTime;
import projectmayhem1983.wheeloftime.entities.creatures.Goat.EntityGoat;
import projectmayhem1983.wheeloftime.entities.creatures.Goat.EntityGoatMob;
import projectmayhem1983.wheeloftime.entities.creatures.Goat.GoatMob;
import projectmayhem1983.wheeloftime.entities.creatures.Goat.RenderGoatMob;
import projectmayhem1983.wheeloftime.entities.creatures.Motai.EntityMotai;
import projectmayhem1983.wheeloftime.entities.creatures.Motai.EntityMotaiMob;
import projectmayhem1983.wheeloftime.entities.creatures.Motai.MotaiMob;
import projectmayhem1983.wheeloftime.entities.creatures.Motai.RenderMotaiMob;
import projectmayhem1983.wheeloftime.entities.mobs.Aiel.AielMob;
import projectmayhem1983.wheeloftime.entities.mobs.Aiel.EntityAiel;
import projectmayhem1983.wheeloftime.entities.mobs.Aiel.EntityAielMob;
import projectmayhem1983.wheeloftime.entities.mobs.Aiel.RenderAielMob;
import projectmayhem1983.wheeloftime.entities.mobs.Ashaman.AshamanMob;
import projectmayhem1983.wheeloftime.entities.mobs.Ashaman.EntityAshaman;
import projectmayhem1983.wheeloftime.entities.mobs.Ashaman.EntityAshamanMob;
import projectmayhem1983.wheeloftime.entities.mobs.Ashaman.RenderAshamanMob;
import projectmayhem1983.wheeloftime.entities.mobs.Damane.DamaneMob;
import projectmayhem1983.wheeloftime.entities.mobs.Damane.EntityDamane;
import projectmayhem1983.wheeloftime.entities.mobs.Damane.EntityDamaneMob;
import projectmayhem1983.wheeloftime.entities.mobs.Damane.RenderDamaneMob;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.EntityMyrddraal;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.EntityMyrddraalMob;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.MyrddraalMob;
import projectmayhem1983.wheeloftime.entities.mobs.Myrddraal.RenderMyrddraalMob;
import projectmayhem1983.wheeloftime.entities.mobs.Shadowhound.DarkhoundMob;
import projectmayhem1983.wheeloftime.entities.mobs.Shadowhound.EntityDarkhound;
import projectmayhem1983.wheeloftime.entities.mobs.Shadowhound.EntityDarkhoundMob;
import projectmayhem1983.wheeloftime.entities.mobs.Shadowhound.RenderDarkhoundMob;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.EntityTrolloc;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.EntityTrollocMob;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.RenderTrollocMob;
import projectmayhem1983.wheeloftime.entities.mobs.Trolloc.TrollocMob;
import projectmayhem1983.wheeloftime.entities.mobs.Whitecloak.EntityWhitecloak;
import projectmayhem1983.wheeloftime.entities.mobs.Whitecloak.EntityWhitecloakMob;
import projectmayhem1983.wheeloftime.entities.mobs.Whitecloak.RenderWhitecloakMob;
import projectmayhem1983.wheeloftime.entities.mobs.Whitecloak.WhitecloakMob;
import projectmayhem1983.wheeloftime.generation.PlantGeneration;
import projectmayhem1983.wheeloftime.generation.PoweroreGeneration;
import projectmayhem1983.wheeloftime.init.WheelOfTimeArmor;
import projectmayhem1983.wheeloftime.init.WheelOfTimeBlocks;
import projectmayhem1983.wheeloftime.init.WheelOfTimeItems;
import projectmayhem1983.wheeloftime.init.WheelOfTimeRecipes;
import projectmayhem1983.wheeloftime.init.WheelOfTimeTools;

@Mod(modid = "wot", name = "Wheel of Time", version = "1.0")
public class WheelOfTime {

	@Metadata
	public static ModMetadata meta;

	// Material
	public static final Item.ToolMaterial cuendillarToolMaterial = EnumHelper.addToolMaterial("cuendillarToolMaterial",
			4, 3000, 12.0F, 5.0F, 40);
	public static final Item.ToolMaterial ironToolMaterial = EnumHelper.addToolMaterial("ironToolMaterial", 2, 250,
			6.0F, 2.0F, 14);
	public static final ArmorMaterial enumArmorMaterialWhitecloak = EnumHelper.addArmorMaterial("Whitecloak", 20,
			new int[] { 3, 6, 6, 3 }, 15);
	public static final ArmorMaterial enumArmorMaterialAielgarb = EnumHelper.addArmorMaterial("Aielgarb", 9,
			new int[] { 1, 4, 2, 2 }, 15);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Item/Block init and registering
		// Config handling

		// Armor Prefixes
		RenderingRegistry.addNewArmourRendererPrefix("5");
		RenderingRegistry.addNewArmourRendererPrefix("6");

		// Mob Rendering
		RenderingRegistry.registerEntityRenderingHandler(EntityMotaiMob.class, new RenderMotaiMob(new MotaiMob(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityTrollocMob.class, new RenderTrollocMob(new TrollocMob(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityAielMob.class, new RenderAielMob(new AielMob(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityGoatMob.class, new RenderGoatMob(new GoatMob(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityDarkhoundMob.class,	new RenderDarkhoundMob(new DarkhoundMob(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityMyrddraalMob.class, new RenderMyrddraalMob(new MyrddraalMob(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityDamaneMob.class,	new RenderDamaneMob(new DamaneMob(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityWhitecloakMob.class,	new RenderWhitecloakMob(new WhitecloakMob(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityAshamanMob.class,	new RenderAshamanMob(new AshamanMob(), 0));

		
		// Blocks,Armor,Tools init
		WheelOfTimeBlocks.init();
		WheelOfTimeArmor.init();
		WheelOfTimeTools.init();
		WheelOfTimeItems.init();

		// Recipe init
		WheelOfTimeRecipes.init();

		// World Gen
		GameRegistry.registerWorldGenerator(new PoweroreGeneration(), 0);
		GameRegistry.registerWorldGenerator(new PlantGeneration(), 0);

		// Entities
		EntityMotai.WheelOfTime();
		EntityTrolloc.WheelOfTime();
		EntityAiel.WheelOfTime();
		EntityGoat.WheelOfTime();
		EntityDarkhound.WheelOfTime();
		EntityMyrddraal.WheelOfTime();
		EntityDamane.WheelOfTime();
		EntityWhitecloak.WheelOfTime();
		EntityAshaman.WheelOfTime();

		// Biomes
		BiomeRegistry.WheelOfTime();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// proxy, entity, Tileentity, GUI and Packet Registering

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		FMLCommonHandler.instance().bus().register(new AngelEventHandler());
		MinecraftForge.EVENT_BUS.register(new AngelEventHandler());

		WorldType WheelOfTime = new WorldTypeWheelOfTime(3, "WheelOfTime");

	}

	public static CreativeTabs tabWheelOfTime = new CreativeTabs("tabWheelOfTime") {
		@Override
		public Item getTabIconItem() {
			return new ItemStack(WheelOfTimeItems.itemWheeloftime).getItem();
		}
	};
}
