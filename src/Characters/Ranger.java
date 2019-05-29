package Characters;

import Armor.Armor;
import Characters.UniversalStats;
import Items.Item;
import weapons.Weapon;

import java.util.ArrayList;

public class Ranger extends Hero{
    private String Species = "Human";
    private String Humantype = "Ranger";
    private String RangerName = UniversalStats.specieBasedName(this.Species);
    private Weapon[] possibleWeapons = UniversalStats.CBW(this.Species,this.Humantype);
    private Weapon RangerWeapon = this.possibleWeapons[(int)(Math.random()*(this.possibleWeapons.length))];
    private int RangerHealth = UniversalStats.classBasedHealth(this.Species,this.Humantype);
    private int RangerStrength = UniversalStats.classBasedStrength(this.Species,this.Humantype);
    private int RangerDamage = RangerWeapon.getDmg() + (RangerStrength-10)/2;
    private int RangerDexerity = UniversalStats.classBasedDexterity(this.Species,this.Humantype);
    private int RangerWisdom = UniversalStats.classBasedWisdom(this.Species,this.Humantype);
    public Armor RangerArmor;
    public ArrayList<Item> RangerInv = new ArrayList<>();


}
