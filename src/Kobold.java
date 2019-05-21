public class Kobold {
    private String Species = "Kobold";
    private String[] possibleTypes = {"Common","Warrior","Shaman","Giant"};
    private String type = UniversalStats.ETP(Species,possibleTypes);
    private String[] possibleWeapons = UniversalStats.CBW(this.type);
    private String weapon = this.possibleWeapons[(int)(Math.random()*(this.possibleWeapons.length))];
    private int hth = UniversalStats.CBH(this.Species,this.type);
    private int dmg = UniversalStats.WBD(this.weapon);
    private int str = 7 + (int)(Math.random()*3);
    private int dex = 15 + (int)(Math.random()*5);
    private int wis = 7 + (int)(Math.random()*2);


    public String getSpecies() {
        return Species;
    }
    public String[] getPossibleTypes() {
        return possibleTypes;
    }
    public String getType() {
        return type;
    }
    public String[] getPossibleWeapons() {
        return possibleWeapons;
    }
    public String getWeapon() {
        return weapon;
    }
    public int getStr() {
        return str;
    }
    public int getDex() {
        return dex;
    }
    public int getWis() {
        return wis;
    }
    public int getHth() {
        return hth;
    }
    public int getDmg() {
        return dmg;
    }

    public void Stats(){
        String species = this.Species;
        String type = this.type;
        int health = this.hth;
        String weapon = this.weapon;
        int damage = this.dmg;
        int strength = this.str;
        int dexterity = this.dex;
        int wisdom = this.wis;
        System.out.print("EnemyType :"+type+" "+species+"\nHealth :"+health+"\nWeapon :"+weapon+"\nDMG :"+damage+"\nSTR :"+strength+"\nDEX :"+dexterity+"\nWIS :"+wisdom+"\n");
    }



    public static void main(String[] args) {
     Kobold Lizzardguy = new Kobold();
        System.out.printf(
                        "Type [%s]\nWeapon: [%s]\nStrength: [%s]\nDexterity: [%s]\nWisdom: [%s]\n"
                            ,Lizzardguy.type,Lizzardguy.weapon,Lizzardguy.str,Lizzardguy.dex,Lizzardguy.wis);
    }
}