package Armor;

public class Armor {

private int armorClass;
private int wght;
private int cost;
private String name;
private String category;
private int reqStrength = 0;

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getWght() {
        return wght;
    }

    public void setWght(int wght) {
        this.wght = wght;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReqStrength() {
        return reqStrength;
    }

    public void setReqStrength(int reqStrength) {
        this.reqStrength = reqStrength;
    }

    public Armor(String Name, String Category, int Cost, int Weight, int ArmorClass, int rqStr){
    this.name = Name;
    this.category = Category;
    this.cost = Cost;
    this.wght = Weight;
    this.armorClass = ArmorClass;
    this.reqStrength = rqStr;


}

    public Armor(int armorClass, int wght, int cost, String name, String catagory, int reqStrength) {
        this.armorClass = armorClass;
        this.wght = wght;
        this.cost = cost;
        this.name = name;
        this.catagory = catagory;
        this.reqStrength = reqStrength;
    }
}
