public class Ranger {
    private String Species = "Human";
    private String type = "Ranger";
    private String[] possibleWeapons = UniversalStats.CBW(this.Species,this.type);
    private String weapon = this.possibleWeapons[(int)(Math.random()*(this.possibleWeapons.length))];
    private int hth = UniversalStats.CBH(this.Species,this.type);
    private int dmg = UniversalStats.WBD(this.weapon);
    private int str = 7 + (int)(Math.random()*3);
    private int dex = 15 +(int)(Math.random()*5);
    private int wis = 7 + (int)(Math.random()*2);
}
