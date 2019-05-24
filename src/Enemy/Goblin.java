package Enemy;

import Characters.UniversalStats;
import weapons.Weapon;

public class Goblin extends Enemy {
    private String species = "Goblin";
    private String GoblinType = UniversalStats.ETP(species);
    private String GoblinName = UniversalStats.specieBasedName(species);
    private Weapon[] possiblesWeapons = UniversalStats.CBW(this.species,this.GoblinType);
    private Weapon GoblinWeapon = this.possiblesWeapons[(int)(Math.random()*(this.possiblesWeapons.length))];
    private int GoblinHealth = UniversalStats.classBasedHealth(this.species,this.GoblinType);
    private int GoblinStrength = UniversalStats.classBasedStrength(species,GoblinType);
    private int GoblinDexterity = UniversalStats.classBasedDexterity(species,GoblinType);
    private int GoblinWisdom = UniversalStats.classBasedWisdom(species,GoblinType);
    private int GoblinDamage = GoblinWeapon.getDmg() + (GoblinStrength-10)/2;


    public Goblin(){
        this.Species = species;
        this.type = GoblinType;
        this.name = GoblinName;
        this.weapon = GoblinWeapon;
        this.hth = GoblinHealth;
        this.dmg = GoblinDamage;
        this.str = GoblinStrength;
        this.dex = GoblinDexterity;
        this.wis = GoblinWisdom;
    }
}
