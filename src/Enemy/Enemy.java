package Enemy;
import weapons.*;
public abstract class Enemy {
//    Enemy Species
    public String Species;
//    Enemy Species Sub Category
    public String type;
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

    Enemy(){}

    public Enemy(String Species,String Type,Weapon Weapon,int Health,int Damage,int Strength,int Dexterity,int Wisdom){
            this.Species = Species;
            this.type = Type;
            this.weapon = Weapon;
            this.hth = Health;
            this.dmg = Damage;
            this.str = Strength;
            this.dex = Dexterity;
            this.wis = Wisdom;
    }

}
