package Enemy;
import Characters.UniversalStats;
import weapons.Weapon;

public class Kobold extends Enemy {
    private String species = "Kobold";
    private String KoboldType = UniversalStats.ETP(species);
    private String KoboldName = UniversalStats.specieBasedName(species);
    private Weapon[] possibleWeapons = UniversalStats.CBW(this.species,this.KoboldType);
    private Weapon KoboldsWeapon = this.possibleWeapons[(int)(Math.random()*(this.possibleWeapons.length))];
    private int KoboldsHealth = UniversalStats.classBasedHealth(this.species,this.KoboldType);
    private int KoboldsStrength = UniversalStats.classBasedStrength(species,KoboldType);
    private int KoboldsDexterity = UniversalStats.classBasedDexterity(species,KoboldType);
    private int KoboldsWisdom = UniversalStats.classBasedWisdom(species,KoboldType);
    private int KoboldsDamage = KoboldsWeapon.getDmg() + (KoboldsStrength-10)/2;


    public Kobold(){
        this.Species = species;
        this.type = KoboldType;
        this.name = KoboldName;
        this.weapon = KoboldsWeapon;
        this.hth = KoboldsHealth;
        this.dmg = KoboldsDamage;
        this.str = KoboldsStrength;
        this.dex = KoboldsDexterity;
        this.wis = KoboldsDexterity;
    }







    public String getKoboldSpecies() {
        return species;
    }

    public String getKoboldType() {
        return KoboldType;
    }

    public Weapon[] getPossibleWeapons() {
        return possibleWeapons;
    }

    public Weapon getKoboldsWeapon() {
        return KoboldsWeapon;
    }

    public int getKoboldsHealth() {
        return KoboldsHealth;
    }

    public int getKoboldsStrength() {
        return KoboldsStrength;
    }

    public int getKoboldsDexterity() {
        return KoboldsDexterity;
    }

    public int getKoboldsWisdom() {
        return KoboldsWisdom;
    }

    public int getKoboldsDamage() {
        return KoboldsDamage;
    }
}