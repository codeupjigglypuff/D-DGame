package Armor;

public class ArmorTest {
    public static void main(String[] args) {
       Armor LeatherArmor = new Armor(10,11,"LeatherArmor");
        System.out.println(LeatherArmor.armorClass);

        LeatherArmor LA = new LeatherArmor();
        System.out.println(LA.name);
        System.out.println(LA.cost);
    }
}
