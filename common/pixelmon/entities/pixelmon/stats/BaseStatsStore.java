package pixelmon.entities.pixelmon.stats;

import net.minecraft.src.EnumCreatureType;
import pixelmon.database.DatabaseStats;
import pixelmon.database.ExperienceGroup;
import pixelmon.database.SpawnConditions;
import pixelmon.enums.EnumPokemon;
import pixelmon.enums.EnumType;

public class BaseStatsStore {
	public String pixelmonName;

	public BaseStatsStore(String name) {
		this.pixelmonName = name;
	}

	public int spDef, spAtt, speed, defence, attack, hp;
	public int evolveLevel, catchRate, malePercent, nationalPokedexNumber;
	public int spawnLevel, spawnLevelRange;
	public int baseExp, baseFriendship;

	public EnumType type1;

	public EnumType type2;

	public float height, width, length;
	public float giScale;

	public boolean canFly, isRideable;

	public EnumPokemon evolveInto;

	public ExperienceGroup experienceGroup;

	public Aggression aggression;

	public EnumCreatureType creatureType;

	public String droppedItem;

	public SwimmingParameters swimmingParameters;
	public SpawnConditions[] spawnConditions;

	public EVsStore evGain;
}
