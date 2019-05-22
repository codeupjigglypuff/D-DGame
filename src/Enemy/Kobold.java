package Enemy;
import Characters.UniversalStats;
import weapons.Weapon;

public class Kobold extends Enemy {

    public static String KoboldType = UniversalStats.ETP("Kobold");
    public static Weapon[] possibleWeapons = UniversalStats.CBW("Kobold",this.type);
    public static Weapon KoboldsWeapon = this.possibleWeapons[(int)(Math.round(Math.random()*(this.possibleWeapons.length)))];
    public static int KoboldsHealth = UniversalStats.CBH("Kobold",KoboldType);
    public static int KoboldsDamage = KoboldsWeapon.getDmg() + (Math.round(str-10)/2);
    public static int KoboldsStrength = 7 + (int)(Math.round(Math.random()*3));
    public static int KoboldsDexterity = 15 + (int)(Math.round(Math.random()*5));
    public static int KoboldsWisdom = 7 + (int)(Math.round(Math.random()*2));



    public Kobold(){
        super("Kobold",UniversalStats.ETP("Kobold"),KoboldType,KoboldsHealth,KoboldsDamage,KoboldsStrength,KoboldsDexterity,KoboldsWisdom);

    }

}