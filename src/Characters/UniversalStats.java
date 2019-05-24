package Characters;
import weapons.*;
public class UniversalStats {


//        Class Based Health
    public static int CBH(String species,String type){
        switch (species) {
            case "Kobold":
                        switch (type) {
                case "Common":
                    return 10 + (int)(Math.round(Math.random()*2));
                case "Warrior":
                    return 12 + (int)(Math.round(Math.random()*2));
                case "Shaman":
                    return 8 + (int)(Math.round(Math.random()*2));
                case "Giant":
                    return 14 + (int)(Math.round(Math.random()*2));
                default:
                    return 10;
    }
            case "Human":
                switch (type){
                    case "Fighter":
                        return 10;
                    case "Wizard":
                        return 6;
                    case "Ranger":
                        return 10;
                }

    default:
            return 10;
}
    }

//    Classed Based Strength
    public static int classBasedStrength(String Species,String Type){

                switch (Type) {
                    case "Common":
                        return 7 + (int)(Math.round(Math.random()*3));
                    case "Warrior":
                        return 8 + (int)(Math.round(Math.random()*2));
                    case "Shaman":
                        return 6 + (int)(Math.round(Math.random()*2));
                    case "Giant":
                        return 10 + (int)(Math.round(Math.random()*2));
                    default:
                        return 7 + (int)(Math.round(Math.random()*3));
                }

    }

    //    Classed Based Dexterity
    public static int classBasedDexterity(String Species,String Type){
        switch (Species){
            case "Kobold":
                switch (Type) {
                    case "Common":
                        return 15 + (int)(Math.round(Math.random()*5));
                    case "Warrior":
                        return 16 + (int)(Math.round(Math.random()*5));
                    case "Shaman":
                        return 15 + (int)(Math.round(Math.random()*5));
                    case "Giant":
                        return 14 + (int)(Math.round(Math.random()*2));
                    default:
                        return 15 + (int)(Math.round(Math.random()*5));
                }
            case "Goblin":
                switch (Type) {
                    case "Common":
                        return 14 + (int)(Math.round(Math.random()*5));
                    case "Warrior":
                        return 16 + (int)(Math.round(Math.random()*5));
                    case "Shaman":
                        return 15 + (int)(Math.round(Math.random()*5));
                    case "Giant":
                        return 14 + (int)(Math.round(Math.random()*2));
                    default:
                        return 15 + (int)(Math.round(Math.random()*5));
                }
            default:
                return 15;
        }
    }

    //    Classed Based Wisdom
    public static int classBasedWisdom(String Species,String Type) {
        switch (Species) {
            case "Kobold":
                switch (Type) {
                    case "Common":
                        return 7 + (int) (Math.round(Math.random() * 2));
                    case "Warrior":
                        return 8 + (int) (Math.round(Math.random() * 2));
                    case "Shaman":
                        return 10 + (int) (Math.round(Math.random() * 4));
                    case "Giant":
                        return 8 + (int) (Math.round(Math.random() * 2));
                    default:
                        return 7 + (int) (Math.round(Math.random() * 3));
                }
            case "Goblin":
                switch (Type) {
                    case "Common":
                        return 7 + (int) (Math.round(Math.random() * 2));
                    case "Warrior":
                        return 8 + (int) (Math.round(Math.random() * 2));
                    case "Shaman":
                        return 10 + (int) (Math.round(Math.random() * 4));
                    case "Hob":
                        return 8 + (int) (Math.round(Math.random() * 2));
                    default:
                        return 7 + (int) (Math.round(Math.random() * 3));
                }
            default:
                return 7;

        }
    }

//        Class Based Weapon
public static Weapon[] CBW(String species,String type){
        switch (species) {
            case "Kobold":
                switch (type) {
                    case "Common":
                        return CommonKoboldWeapons;
                    case "Warrior":
                        return WarriorKoboldWeapons;
                    case "Shaman":
                        return ShamanKoboldWeapons;
                    case "Giant":
                        return GiantKoboldWeapons;
                }
            case "Goblin":
                switch (type){
                    case "Common":
                        return CommonGoblinWeapons;
                    case "Archer":
                        return ArcherGoblinWeapons;
                    case "Giant":
                        return HobGoblinWeapons;
                }
            default:
                return CommonWeapons;
        }
}


private static Weapon[] CommonWeapons = {new Dagger(),new Sling(),new RustySpoon(),new PointyStick()};
private static Weapon[] CommonKoboldWeapons = {new Dagger(),new Sling(),new RustySpoon(),new PointyStick()};
private static Weapon[] WarriorKoboldWeapons = {new ShortSword(),new Spear(),new HandAxe()};
private static Weapon[] ShamanKoboldWeapons = {new Staff(),new PointyStick()};
private static Weapon[] GiantKoboldWeapons = {new Sword(),new HeavyBranch(),new Axe()};
private static Weapon[] CommonGoblinWeapons = {new Sword(),new HeavyBranch(),new Axe()};
private static Weapon[] ArcherGoblinWeapons = {};
private static Weapon[] HobGoblinWeapons = {new GreatSword(),new Axe()};









    //        Characters Type Probability
public static String ETP(String Species){
    String[] EnemyArray = {"Common","Warrior","Shaman","Giant"};
    switch (Species){
        case "Kobold":
            double ran = (Math.random()*10)+1;
            if(1 <= ran && ran <= 4){
                return EnemyArray[0];
            }else if (4 < ran && ran <= 7){
                return EnemyArray[1];
            }else if (7 < ran && ran <= 9){
                return EnemyArray[2];
            }else{
                return EnemyArray[3];
            }

        default:
            return "Common";
    }

}




}

