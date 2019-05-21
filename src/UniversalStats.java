import java.lang.reflect.Array;

public class UniversalStats {


//        Class Based Health
    public static int CBH(String species,String type){
        switch (species) {
            case "Kobold":
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
            case "Fists":
                return 2;
            default:
                return 4;
        }
    }



//        Class Based Weapon
public static String[] CBW(String type){
    switch (type) {
        case "Common":
            return CommonWeapons;
        case "Warrior":
            return WarriorWeapons;
        case "Shaman":
            return ShamanWeapons;
        case "Giant":
            return GiantWeapons;
        default:
            return CommonWeapons;
    }
}

private static String[] CommonWeapons = {"Dagger","Sling","Fists"};
private static String[] WarriorWeapons = {"Short_Sword","Spear"};
private static String[] ShamanWeapons = {"Magic_Staff"};
private static String[] GiantWeapons = {"Short_Staff","Spear","Magic_Staff"};







}

