package pixelmon.config;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import cpw.mods.fml.common.registry.EntityRegistry;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityEggInfo;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EnumCreatureType;
import net.minecraft.src.ModLoader;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;
import net.minecraftforge.common.MinecraftForge;
import pixelmon.Pixelmon;
import pixelmon.database.DatabaseStats;
import pixelmon.database.DatabaseTrainers;
import pixelmon.entities.pokemon.*;
import pixelmon.entities.trainers.EntityTrainerBugCatcher;
import pixelmon.entities.trainers.EntityTrainerYoungster;
import pixelmon.entities.trainers.EntityTrainerYoungster02;

public class PixelmonEntityList {
	private static Map<Integer, ClassType> IDtoTypeMapping = new HashMap<Integer, ClassType>();

	/** Maps entity names to their numeric identifiers */
	public static Map<Integer, String> idToStringMapping = new HashMap<Integer, String>();

	/** This is a HashMap of the Creative Entity Eggs/Spawners. */
	public static HashMap<Integer, EntityEggInfo> entityEggs = new HashMap<Integer, EntityEggInfo>();

	/**
	 * adds a mapping between Entity classes and both a string representation
	 * and an ID
	 */
	private static void addMapping(String par1Str, int par2, ClassType type) {
		IDtoTypeMapping.put(Integer.valueOf(par2), type);
		idToStringMapping.put(Integer.valueOf(par2), par1Str);
	}

	/**
	 * Create a new instance of an entity in the world by using the entity name.
	 */
	public static Entity createEntityByName(String par0Str, World par1World) {
		Entity var2 = null;

		try {
			Class<?> var3 = (Class<?>) Class.forName("pixelmon.entities.pokemon.Entity" + par0Str);

			if (var3 != null) {
				var2 = (Entity) var3.getConstructor(new Class[] { World.class }).newInstance(new Object[] { par1World });
			}
		} catch (Exception var4) {
			var4.printStackTrace();
		}

		return var2;
	}

	/**
	 * create a new instance of an entity from NBT store
	 */
	public static Entity createEntityFromNBT(NBTTagCompound par0NBTTagCompound, World par1World) {
		EntityLiving var2 = null;

		try {
			Class<?> var3 = (Class<?>) Class.forName("pixelmon.entities.pokemon.Entity" + par0NBTTagCompound.getString("id"));

			if (var3 != null) {
				var2 = (EntityLiving) var3.getConstructor(new Class[] { World.class }).newInstance(new Object[] { par1World });
			}
		} catch (Exception var4) {
			var4.printStackTrace();
		}

		if (var2 != null) {
			var2.readFromNBT(par0NBTTagCompound);
		} else {
			System.out.println("Skipping Entity with id " + par0NBTTagCompound.getString("id"));
		}

		return var2;
	}

	/**
	 * Create a new instance of an entity in the world by using an entity ID.
	 */
	public static Entity createEntityByID(int par0, World par1World) {
		Entity var2 = null;

		try {

			Class<?> var3 = (Class<?>) Class.forName("pixelmon.entities.pokemon.Entity" + idToStringMapping.get(Integer.valueOf(par0)));

			if (var3 != null) {
				var2 = (Entity) var3.getConstructor(new Class[] { World.class }).newInstance(new Object[] { par1World });
			}
		} catch (Exception var4) {
			var4.printStackTrace();
		}

		if (var2 == null) {
			System.out.println("Skipping Entity with id " + par0);
		}

		return var2;
	}

	/**
	 * Finds the class using IDtoClassMapping and classToStringMapping
	 */
	public static String getStringFromID(int par0) {
		return idToStringMapping.get(Integer.valueOf(par0));
	}

	public static ClassType getClassTypeFromID(int par0) {
		return (ClassType) IDtoTypeMapping.get(Integer.valueOf(par0));
	}

	static {
		// Pokemon
		addMapping("Abra", IDListPixelmon.abraId, ClassType.Pixelmon);
		addMapping("Arbok", IDListPixelmon.arbokId, ClassType.Pixelmon);
		addMapping("Blastoise", IDListPixelmon.blastoiseId, ClassType.Pixelmon);
		addMapping("Bulbasaur", IDListPixelmon.bulbasaurId, ClassType.Pixelmon);
		addMapping("Butterfree", IDListPixelmon.butterfreeId, ClassType.Pixelmon);
		addMapping("Caterpie", IDListPixelmon.caterpieId, ClassType.Pixelmon);
		addMapping("Charizard", IDListPixelmon.charizardId, ClassType.Pixelmon);
		addMapping("Charmander", IDListPixelmon.charmanderId, ClassType.Pixelmon);
		addMapping("Charmeleon", IDListPixelmon.charmeleonId, ClassType.Pixelmon);
		addMapping("Cubone", IDListPixelmon.cuboneId, ClassType.Pixelmon);
		addMapping("Diglett", IDListPixelmon.diglettId, ClassType.Pixelmon);
		addMapping("Dugtrio", IDListPixelmon.dugtrioId, ClassType.Pixelmon);
		addMapping("Eevee", IDListPixelmon.eeveeId, ClassType.Pixelmon);
		addMapping("Ekans", IDListPixelmon.ekansId, ClassType.Pixelmon);
		addMapping("Electrode", IDListPixelmon.electrodeId, ClassType.Pixelmon);
		addMapping("Flareon", IDListPixelmon.flareonId, ClassType.Pixelmon);
		addMapping("Gastly", IDListPixelmon.gastlyId, ClassType.Pixelmon);
		addMapping("Geodude", IDListPixelmon.geodudeId, ClassType.Pixelmon);
		addMapping("Goldeen", IDListPixelmon.goldeenId, ClassType.WaterPixelmon);
		addMapping("Growlithe", IDListPixelmon.growlitheId, ClassType.Pixelmon);
		addMapping("Gyarados", IDListPixelmon.gyaradosId, ClassType.WaterPixelmon);
		addMapping("Horsea", IDListPixelmon.horseaId, ClassType.WaterPixelmon);
		addMapping("Ivysaur", IDListPixelmon.ivysaurId, ClassType.Pixelmon);
		addMapping("Jolteon", IDListPixelmon.jolteonId, ClassType.Pixelmon);
		addMapping("Jigglypuff", IDListPixelmon.jigglypuffId, ClassType.Pixelmon);
		addMapping("Magikarp", IDListPixelmon.magikarpId, ClassType.WaterPixelmon);
		addMapping("Magnemite", IDListPixelmon.magnemiteId, ClassType.Pixelmon);
		addMapping("Mankey", IDListPixelmon.mankeyId, ClassType.Pixelmon);
		addMapping("Metapod", IDListPixelmon.metapodId, ClassType.Pixelmon);
		addMapping("Mew", IDListPixelmon.mewId, ClassType.Pixelmon);
		addMapping("Sandile", IDListPixelmon.sandileId, ClassType.Pixelmon);
		addMapping("Krokorok", IDListPixelmon.krokorokId, ClassType.Pixelmon);
		addMapping("Miltank", IDListPixelmon.miltankId, ClassType.Pixelmon);
		addMapping("Pidgey", IDListPixelmon.pidgeyId, ClassType.Pixelmon);
		addMapping("Pikachu", IDListPixelmon.pikachuId, ClassType.Pixelmon);
		addMapping("Pidgeotto", IDListPixelmon.pidgeottoId, ClassType.Pixelmon);
		addMapping("Pidgeot", IDListPixelmon.pidgeotId, ClassType.Pixelmon);
		addMapping("Ninetales", IDListPixelmon.ninetalesId, ClassType.Pixelmon);
		addMapping("Oddish", IDListPixelmon.oddishId, ClassType.Pixelmon);
		addMapping("Omanyte", IDListPixelmon.omanyteId, ClassType.WaterPixelmon);
		addMapping("Omastar", IDListPixelmon.omastarId, ClassType.WaterPixelmon);
		addMapping("Psyduck", IDListPixelmon.psyduckId, ClassType.Pixelmon);
		addMapping("Rattata", IDListPixelmon.rattataId, ClassType.Pixelmon);
		addMapping("Seaking", IDListPixelmon.seakingId, ClassType.WaterPixelmon);
		addMapping("Shellder", IDListPixelmon.shellderId, ClassType.Pixelmon);
		addMapping("Snorlax", IDListPixelmon.snorlaxId, ClassType.Pixelmon);
		addMapping("Squirtle", IDListPixelmon.squirtleId, ClassType.Pixelmon);
		addMapping("Staryu", IDListPixelmon.staryuId, ClassType.WaterPixelmon);
		addMapping("Starmie", IDListPixelmon.starmieId, ClassType.WaterPixelmon);
		addMapping("Trapinch", IDListPixelmon.trapinchId, ClassType.Pixelmon);
		addMapping("Venusaur", IDListPixelmon.venusaurId, ClassType.Pixelmon);
		addMapping("Voltorb", IDListPixelmon.voltorbId, ClassType.Pixelmon);
		addMapping("Vulpix", IDListPixelmon.vulpixId, ClassType.Pixelmon);
		addMapping("Wartortle", IDListPixelmon.wartortleId, ClassType.Pixelmon);
		addMapping("Wigglytuff", IDListPixelmon.wigglytuffId, ClassType.Pixelmon);
		addMapping("Zubat", IDListPixelmon.zubatId, ClassType.Pixelmon);
		addMapping("Magneton", IDListPixelmon.magnetonId, ClassType.Pixelmon);
		addMapping("Vibrava", IDListPixelmon.vibravaId, ClassType.Pixelmon);
		addMapping("Mareep", IDListPixelmon.mareepId, ClassType.Pixelmon);
		addMapping("Tentacool", IDListPixelmon.tentacoolId, ClassType.WaterPixelmon);
		addMapping("Solrock", IDListPixelmon.solrockId, ClassType.Pixelmon);
		addMapping("Lunatone", IDListPixelmon.lunatoneId, ClassType.Pixelmon);
		addMapping("NidoranMale", IDListPixelmon.nidoranMaleId, ClassType.Pixelmon);
		addMapping("Vaporeon", IDListPixelmon.vaporeonId, ClassType.Pixelmon);
		addMapping("Gloom", IDListPixelmon.gloomId, ClassType.Pixelmon);
		addMapping("Krabby", IDListPixelmon.krabbyId, ClassType.Pixelmon);
		addMapping("Weedle", IDListPixelmon.weedleId, ClassType.Pixelmon);
		addMapping("Kakuna", IDListPixelmon.kakunaId, ClassType.Pixelmon);
		addMapping("Koffing", IDListPixelmon.koffingId, ClassType.Pixelmon);
		addMapping("Weezing", IDListPixelmon.weezingId, ClassType.Pixelmon);
		addMapping("Primeape", IDListPixelmon.primeapeId, ClassType.Pixelmon);

		// Trainers
		addMapping("Youngster", IDListTrainer.trainerYoungsterId, ClassType.Trainer);
		addMapping("Youngster02", IDListTrainer.trainerYoungster2Id, ClassType.Trainer);
		addMapping("BugCatcher", IDListTrainer.trainerBugCatcherId, ClassType.Trainer);
	}

	public static void registerEntities() {
		Iterator i = idToStringMapping.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry entry = (Map.Entry) i.next();
			String name =  (String)entry.getValue();
			ClassType type = getClassTypeFromID((Integer) entry.getKey());
			try {
				if (type == ClassType.Pixelmon || type == ClassType.WaterPixelmon)
					EntityRegistry.registerModEntity((Class) Class.forName("pixelmon.entities.pokemon.Entity" + entry.getValue()), name, (Integer) entry.getKey(), Pixelmon.instance, 80, 1, true);
				else if (type == ClassType.Trainer)
					EntityRegistry.registerModEntity((Class) Class.forName("pixelmon.entities.trainers.EntityTrainer" + entry.getValue()), name, (Integer) entry.getKey(), Pixelmon.instance, 80, 1, true);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	public static void addSpawns() {
		Iterator i = idToStringMapping.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry entry = (Map.Entry) i.next();
			String name = (String) entry.getValue();
			ClassType type = getClassTypeFromID((Integer) entry.getKey());
			BiomeGenBase[] biomes;
			if (type == ClassType.Pixelmon) {
				biomes = DatabaseStats.GetSpawnBiomes(name);
				int rarity = DatabaseStats.GetRarity(name);
				int groupMin = DatabaseStats.GetMinGroupSize(name);
				int groupMax = DatabaseStats.GetMaxGroupSize(name);
				EnumCreatureType creaturetype = DatabaseStats.GetCreatureType(name);
				if (rarity != -1) {
					try {
						EntityRegistry.addSpawn((Class) Class.forName("pixelmon.entities.pokemon.Entity" + entry.getValue()), rarity, groupMin, groupMax, creaturetype, biomes);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
//				if (new File("resources/newsound/pixelmon/" + name.toLowerCase() + ".ogg").exists())
//					ModLoader.getMinecraftInstance().installResource("newsound/pixelmon/" + name.toLowerCase() + ".ogg", new File("resources/newsound/pixelmon/" + name.toLowerCase() + ".ogg"));
			} else if (type == ClassType.Trainer) {
				biomes = DatabaseTrainers.GetSpawnBiomes(name);
				try {
					EntityRegistry.addSpawn((Class) Class.forName("pixelmon.entities.trainers.EntityTrainer" + entry.getValue()),  10, 1, 1, EnumCreatureType.creature, biomes);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public enum ClassType {
		Trainer, Pixelmon, WaterPixelmon
	}
}
