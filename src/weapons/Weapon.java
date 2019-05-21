package weapons;

public class Weapon {
    private String name;
    private int dmg;
    private String category;
    private int cost;

    public Weapon( int dmg, int cost, String category, String name) {
        this.name = name;
        this.dmg = dmg;
        this.category = category;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getDmg() {
        return dmg;
    }

    public String getCategory() {
        return category;
    }

    public int getCost(){
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(int cost){
        this.cost = cost;
    }
}
