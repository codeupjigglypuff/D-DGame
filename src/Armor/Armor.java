package Armor;

public class Armor {

public int armorClass;
public int wght;
public int cost;
public String name;
public String catagory;
public int reqStrength = 0;

    public Armor(){
        this.name = "Unknown";
    }

    public Armor(int Cost,int AC,String Name){
        this.cost = Cost;
        this.armorClass = AC;
        this.name = Name;
    }
}
