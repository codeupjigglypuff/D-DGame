package Enemy;
import Armor.Armor;
import Items.Healing_Potion;
import Items.Item;
import weapons.*;

import java.util.ArrayList;

public class Enemy {
//    Enemy Species
    public String Species;
//    Enemy Species Sub Category
    public String type;
    public String name;
//    weapon enemy is currently holding
    public Weapon weapon;
//    Enemies Health
    public int hth;
//    damage listed is damage with strength modifier
    public int dmg;
//    Average Strength is 10 every 2 points above or below 10 grants 1 point of dmg modifier
    public int str;
//    Modifier for light and ranged weapons
    public int dex;
//
    public int wis;

    public ArrayList<Item> inv = new ArrayList<>();

    public Armor arm;

    Enemy(){}

    public Enemy(String Species,String Type,String Name,Weapon Weapon,int Health,int Damage,int Strength,int Dexterity,int Wisdom,ArrayList<Item> Inventory,Armor ArmorType){
            this.Species = Species;
            this.type = Type;
            this.name = Name;
            this.weapon = Weapon;
            this.hth = Health;
            this.dmg = Damage;
            this.str = Strength;
            this.dex = Dexterity;
            this.wis = Wisdom;
            this.inv = Inventory;
            this.arm = ArmorType;
    }

    public String Inventorylist(){
        String list = "";
        for (int i = 0;i < this.inv.size();i++){
            list += "[";
            list += this.inv.get(i).getName();
            list += "]";
        }
        return list;
    }





    public String inspect(){
        return "\t"+this.type+" "+this.Species+
                "\nName :"+this.name+
                "\nWeapon :"+this.weapon.getName()+
                "\nWeapon DMG :"+this.weapon.getDmg()+
                "\nDamage :"+this.dmg+
                "\nStrength :"+this.str+
                "\nDexterity :"+this.dex+
                "\nWisdom :"+this.wis+
                "\nHealth :"+this.hth+
                "\nArmor :"+this.arm.getName()+
                "\nInventory :"+Inventorylist()+"\n";

    }

}
