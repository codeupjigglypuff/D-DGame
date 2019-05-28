package Armor;

public class Armor {

public int armorClass;
public int wght;
public int cost;
public String name;
public String catagory;
public int reqStrength = 0;

    public Armor(int armorClass, int wght, int cost, String name, String catagory, int reqStrength) {
        this.armorClass = armorClass;
        this.wght = wght;
        this.cost = cost;
        this.name = name;
        this.catagory = catagory;
        this.reqStrength = reqStrength;
    }
}
