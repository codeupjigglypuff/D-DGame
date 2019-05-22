package Enemy;
import Characters.UniversalStats;
import weapons.Weapon;

public class Kobold extends Enemy {

    private String type = UniversalStats.ETP(Species);
    private Weapon[] possibleWeapons = UniversalStats.CBW("Kobold",this.type);
    private Weapon weapon = this.possibleWeapons[(int)(Math.round(Math.random()*(this.possibleWeapons.length)))];
    private int hth = UniversalStats.CBH(this.Species,this.type);
    private int dmg = UniversalStats.WBD(this.weapon);
    private int str = 7 + (int)(Math.round(Math.random()*3));
    private int dex = 15 + (int)(Math.round(Math.random()*5));
    private int wis = 7 + (int)(Math.round(Math.random()*2));



    public Kobold(){
        String KoboldsType = type;
        Weapon KoboldsWeapon = weapon;
        int KoboldsHealth = hth;
        int KoboldsDamage = KoboldsWeapon.getDmg() + (str-10)/2;
        int KoboldsStrength = str;
        int KoboldsDexterity = dex;
        int KoboldsWisdom = wis;
        super("Kobold",KoboldsType,KoboldsWeapon,KoboldsHealth,KoboldsDamage,KoboldsStrength,KoboldsDexterity,KoboldsWisdom);




    }

}