package Characters;
import weapons.*;
public class UniversalStats {


//        Class Based Health
    public static int CBH(String species,String type){
        switch (species) {
            case "Enemy.Kobold":
                        switch (type) {
                case "Common":
                    return 10;
                case "Warrior":
                    return 12;
                case "Shaman":
                    return 8;
                case "Giant":
                    return 14;
                default:
                    return 10;
    }
            case "Human":
                switch (type){
                    case "Characters.Fighter":
                        return 10;
                    case "Characters.Wizard":
                        return 6;
                    case "Characters.Ranger":
                        return 10;
                }

    default:
            return 10;
}
    }



//        Weapon Based Damage
    public static int WBD(String weapon){
        switch (weapon){
            case "Spear":
                return 6;
            case "Sling":
                return 4;
            case "Dagger":
                return 4;
            case "Short_Sword":
                return 6;
            case "Hand_Axe":
                return 4;
            case "Fists":
                return 2;
            case "Sword":
                return 8;
            case "Axe":
                return 6;
            case "Heavy_Branch":
                return 6;
            case "Great_Sword":
                return 10;
            case "Spell_Book":
                return 6;
            case "Short_Bow":
                return 6;
            default:
                return 4;
        }
    }



//        Class Based Weapon
public static Weapon[] CBW(String species,String type){
        switch (species) {
            case "Enemy.Kobold":
                switch (type) {
                    case "Common":
                        return CommonWeapons;
                    case "Warrior":
                        return WarriorWeapons;
                    case "Shaman":
                        return ShamanWeapons;
                    case "Giant":
                        return GiantWeapons;
                }
            case "Human":
                switch (type) {
                    case "Characters.Fighter":
                        return FighterStartingWeapons;
                    case "Characters.Wizard":
                        return WizardStartingWeapons;
                    case "Characters.Ranger":
                        return RangerStartingWeapons;
                }
            default:
                return CommonWeapons;
        }
}

private static Weapon[] CommonWeapons = {new Dagger(),new Sling(),new RustySpoon(),new PointyStick()};
private static Weapon[] WarriorWeapons = {new ShortSword(),new Spear(),new HandAxe()};
private static Weapon[] ShamanWeapons = {new Staff(),new PointyStick()};
private static Weapon[] GiantWeapons = {new Sword(),new HeavyBranch(),new Axe()};
private static Weapon[] FighterStartingWeapons = {new Sword(),new GreatSword(),new Axe()};
private static Weapon[] WizardStartingWeapons = {new SpellBook()};
private static Weapon[] RangerStartingWeapons = {new Spear()};


//        Characters Type Probability
public static String ETP(String Species){
    private String[] EnemyArray = {"Common","Warrior","Shaman","Giant"}
    switch (Species){
        case "Enemy.Kobold":
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

