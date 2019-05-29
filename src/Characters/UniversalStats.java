package Characters;
import Armor.*;
import Items.*;
import weapons.*;

import java.util.ArrayList;

public class UniversalStats {


    public static String[] koboldNames = {"Zeekkri","Atroo","Velsa","Oska","Mozko","Sozli","Fothe","Mesgre","Uthugo","Midaassi","Ghog","Nak","Vhob","Mognoo","Vrikzea","Jadzoolp","Jepred","Zilrirma","Zeknidzaald","Gelnikmos","Lassoo","Losgoo","Rukre","Hozli","Fasge","Tirgi","Fothru","Irgu","Seznurke","Oozkorso","Dres","Grulp","Qolp","Rozob","Dhenzork","Rekki","Guzha","Ulzoknos","Igzuprel","Uxilreenk","Pithrear","Goksi","Dohroon","Sassu","Rolro","Ozre","Hulkis","Pesgra","Luzugo","Tooglihrar"};
    public static String[] goblinNames = {"Droan","Wart","Purd","Rornk","Ghenglu","Karte","Norpan","Junglo","Fluttungis","Kabmoudzaff","Krosh","Poz","Guz","Flun","Ghumkoawg","Zubro","Angboun","Kumzurg","Gharpogog","Kridgugnonk","Juglu","Hophob","Chokchok","Henbas","Pugo","Gradni","Liknoophi","Lolvimdo","Vrognamdu","Rixoatluk","Morch","Vaz","Flag","Ghurg","Windab","Zengbiz","Bugglaff","Ghidzat","Abzegnas","Oonzobnon"};
    public static String[] humanNames = {"Brittany","Gilbert","Sharon","Lambert","Ervin","Franklin","Mable","Morales","Janet","Carroll","Katherine","Maxwell","Velma","Byrd","Pauline","Stephens","Cassandra","Marshall","Elena","Love","Lillie","Mccarthy","Julie","Campbell","Dexter","Becker","Eunice","Gray","Miriam","Reeves","Tanya","French","Roy","Goodwin","Jody","Gutierrez","Van","Townsend","Pedro","Jones","Ignacio","Hammond","Warren","Johnston","Leo","Cohen","Gabriel","Berry","Frankie","Ramos","Sylvester","Meyer","Terri","Figueroa","Sonia","Wallace","Phil","Harris","Karl","Fisher","Roland","Johnson","Angelo","Wolfe","Franklin","Shaw","Stanley","Vega","Eloise","Harper","Mabel","Gonzalez","Clyde","Joseph","Luther","Bryan","Harriet","Thompson","Stuart","Boone","Leland","Cain","Rickey","Mcgee","Steve","Porter","Gwen","Craig","Kara","Dean","Erick","Adkins","Guy","Walters","Jan","Pratt","Timothy","Parks","Albert","Newman","Herbert","Wilkins","Christine","Pearson","Woodrow","Jackson","Zachary","Norman","Megan","Cummings","Delores","Hayes","Erik","Davidson","Aubrey","Oliver","Ernestine","Newton","Rosemary","Harrington","Guillermo","Underwood","Tommy","Brewer","Sadie","Colon","Alton","Baker","Dora","Henry","Candace","Larson","Alma","Bowman","Jane","Olson","Leslie","Rowe","Lindsey","Lawrence","Jon","Singleton","Joanna","Caldwell","Cecilia","Roy","Darren","Ruiz","Preston","Bates","Victoria","Powell","Dan","Sanders","Darrell","Ford","Archie","Davis","Bonnie","Norton","Trevor","Brady","Connie","Dennis","Owen","Turner","Helen","Fletcher","Pat","Stanley","Kurt","Allen","Anthony","Stone","Everett","Mendoza","Viola","Willis","Marta","Simmons","Tabitha","Mathis","Roxanne","Harrison","Sylvia","Hill","Beatrice","Howard","Vincent","Hudson","Ginger","Rose","Stephanie","Anderson","Marlon","Freeman","Colin","Watkins","Lynette","Reed"};

//    Species Based Name
    public static String specieBasedName(String Species){
        try {
            switch (Species) {
                case "Kobold":
                    return koboldNames[(int) (Math.round(Math.random() * koboldNames.length))];
                case "Goblin":
                    return goblinNames[(int) (Math.round(Math.random() * goblinNames.length))];
                case "Human":
                    return humanNames[(int) (Math.round(Math.random() * humanNames.length))];
                default:
                    return "Bob";
            }
            }catch (ArrayIndexOutOfBoundsException e){
                return "bob";
        }
    }



//    Class Based Armor
    public static Armor classBasedArmor(String Species,String type){
        double ran = (Math.random()*10)+1;
        switch (Species) {
            case "Kobold":
                switch (type) {
                    case "Common":
                        if (1 <= ran && ran <= 9.5){
                            return new NoArmor();
                        }else{
                            return new PaddedArmor();
                        }
                    case "Warrior":
                        if (1 <= ran && ran <= 5){
                            return new NoArmor();
                        }else if (5 < ran && ran <= 9){
                            return new PaddedArmor();
                        }else{
                            return new LeatherArmor();
                        }
                    case "Shaman":
                        if (1 <= ran && ran <= 9) {
                            return new NoArmor();
                        }else{
                            return new ChainShirtArmor();
                        }
                    case "Giant":
                        if (1 <= ran && ran <= 5){
                            return new NoArmor();
                        }else if(5 < ran && ran <= 7){
                            return new StuddedLeatherArmor();
                        }else if(7 < ran && ran <= 9){
                            return new HideArmor();
                        }else{
                            return new ScaleMailArmor();
                        }
                }
            case "Goblin":
                switch (type){
                    case "Common":
                        if(1 <= ran && ran <= 7){
                            return new NoArmor();
                        }else if(7 < ran && ran <= 9){
                            return new PaddedArmor();
                        }else{
                            return new LeatherArmor();
                        }
                    case "Archer":
                        if (1 <= ran && ran <= 8){
                            return new NoArmor();
                        }else if(8 < ran && ran <= 9.5){
                            return new PaddedArmor();
                        }else{
                            return new LeatherArmor();
                        }
                    case "Hob":
                        if (1 <= ran && ran <= 2){
                            return new NoArmor();
                        }else if (2 < ran && ran <= 5){
                            return new ScaleMailArmor();
                        }else if (5 < ran && ran <= 7){
                            return new BreastPlateArmor();
                        }else if (7 < ran && ran <= 9){
                            return new RingMailArmor();
                        }else if (9 < ran && ran <= 9.75){
                            return new SplintArmor();
                        }else {
                            return new PlateArmor();
                        }
                }
            case "Human":
                switch (type){
                    case "Fighter":

                    case "Ranger":

                    case "Wizard":

                }
            default:
                return new NoArmor();
        }
    }



    public static ArrayList classBasedInventory(String species, String type){
        double ran = (Math.random()*10)+1;
        ArrayList<Item> inv = new ArrayList<>();
        switch (species) {
            case "Kobold":
                switch (type) {
                    case "Common":
                        if (1 <= ran && ran <= 7){
                            inv.add(new GoldBag((int)(Math.random()*5)+1));
                            return inv;
                        }else if (7 < ran && ran <= 9.75){
                            inv.add(new Healing_Potion());
                            inv.add(new GoldBag((int)(Math.random()*5)+1));
                            return inv;
                        }else{
                            inv.add(new Healing_Potion());
                            inv.add(new Healing_Potion());
                            inv.add(new GoldBag((int)(Math.random()*5)+1));
                            return inv;
                        }
                    case "Warrior":
                        if (1 <= ran && ran <= 5){
                            inv.add(new GoldBag((int)(Math.random()*5)+1));
                            return inv;
                        }else if (5 < ran && ran <= 9.5){
                            inv.add(new GoldBag((int)(Math.random()*5)+1));
                            inv.add(new Healing_Potion());
                            return inv;
                        }else{
                            inv.add(new GoldBag((int)(Math.random()*5)+1));
                            inv.add(new Healing_Potion());
                            inv.add(new Healing_Potion());
                            return inv;
                        }
                    case "Shaman":
                        if (1 <= ran && ran <= 8) {
                            inv.add(new GoldBag((int)(Math.random()*5)+1));
                            return inv;
                        }else{
                            inv.add(new GoldBag((int)(Math.random()*5)+1));
                            inv.add(new Healing_Potion());
                            return inv;
                        }
                    case "Giant":
                        if (1 <= ran && ran <= 2){
                            inv.add(new GoldBag((int)(Math.random()*10)+1));
                            return inv;
                        }else if(2 < ran && ran <= 8){
                            inv.add(new Healing_Potion());
                            inv.add(new GoldBag((int)(Math.random()*10)+1));
                            return inv;
                        }else if(8 < ran && ran <= 9.75){
                            inv.add(new GoldBag((int)(Math.random()*10)+1));
                            inv.add(new Healing_Potion());
                            inv.add(new Healing_Potion());
                            return inv;
                        }else{
                            inv.add(new GoldBag((int)(Math.random()*10)+1));
                            inv.add(new Healing_Potion());
                            inv.add(new Healing_Potion());
                            inv.add(new Healing_Potion());
                            return inv;
                        }
                }
            case "Goblin":
                switch (type){
                    case "Common":
                        if(1 <= ran && ran <= 9){
                            inv.add(new GoldBag((int)(Math.random()*5)+1));
                            return inv;
                        }else{
                            inv.add(new GoldBag((int)(Math.random()*5)+1));
                            inv.add(new Healing_Potion());
                            return inv;
                        }
                    case "Archer":
                        if (1 <= ran && ran <= 9.5){
                            inv.add(new GoldBag((int)(Math.random()*5)+1));
                            return inv;
                        }else{
                            inv.add(new GoldBag((int)(Math.random()*5)+1));
                            inv.add(new Healing_Potion());
                            return inv;
                        }
                    case "Hob":
                        if (1 <= ran && ran <= 2){
                            inv.add(new GoldBag((int)(Math.random()*10)+1));
                            return inv;
                        }else if (2 < ran && ran <= 8){
                            inv.add(new GoldBag((int)(Math.random()*10)+1));
                            inv.add(new Healing_Potion());
                            return inv;
                        }else {
                            inv.add(new GoldBag((int)(Math.random()*10)+1));
                            inv.add(new Healing_Potion());
                            inv.add(new Healing_Potion());
                            return inv;
                        }
                }
            case "Human":
                switch (type){
                    case "Fighter":
                        inv.add(new GoldBag((int)(Math.random()*150)+51));
                        inv.add(new Healing_Potion());
                        inv.add(new Healing_Potion());
                        inv.add(new Healing_Potion());
                    case "Ranger":
                        inv.add(new GoldBag((int)(Math.random()*150)+51));
                        inv.add(new Healing_Potion());
                        inv.add(new Healing_Potion());
                        inv.add(new Healing_Potion());
                    case "Wizard":
                        inv.add(new GoldBag((int)(Math.random()*150)+51));
                        inv.add(new Healing_Potion());
                        inv.add(new Healing_Potion());
                        inv.add(new Healing_Potion());
                }
            default:
                inv.add(new GoldBag((int)(Math.random()*5)+1));
                return inv;
        }
    }



    //        Class Based Health
    public static int classBasedHealth(String species,String type){
        switch (species) {
            case "Kobold":
                        switch (type) {
                case "Common":
                    return 10+(int)(Math.round(Math.random()*2));
                case "Warrior":
                    return 12+(int)(Math.round(Math.random()*2));
                case "Shaman":
                    return 8+(int)(Math.round(Math.random()*2));
                case "Giant":
                    return 14+(int)(Math.round(Math.random()*2));
                }
            case "Goblin":
                switch (type){
                    case "Common":
                        return 10+(int)(Math.round(Math.random()*2));
                    case "Archer":
                        return 12+(int)(Math.round(Math.random()*2));
                    case "Hob":
                        return 8+(int)(Math.round(Math.random()*2));
                }
            case "Human":
                switch (type){
                    case "Fighter":
                        return (int)(Math.round(Math.random()*24)+5);
                    case "Ranger":
                        return (int)(Math.round(Math.random()*24)+5);
                    case "Wizard":
                        return (int)(Math.round(Math.random()*24)+5);
                }
            default:
                    return 10;
        }
    }

//    Classed Based Strength
    public static int classBasedStrength(String Species,String Type){
        switch (Species){
            case "Kobold":
                switch (Type) {
                    case "Common":
                        return 7+(int)(Math.round(Math.random()*3));
                    case "Warrior":
                        return 8+(int)(Math.round(Math.random()*2));
                    case "Shaman":
                        return 6+(int)(Math.round(Math.random()*2));
                    case "Giant":
                        return 10+(int)(Math.round(Math.random()*2));
                }
            case "Goblin":
                switch (Type) {
                    case "Common":
                        return 8+(int)(Math.round(Math.random()*2));
                    case "Archer":
                        return 6+(int)(Math.round(Math.random()*2));
                    case "Hob":
                        return 13+(int)(Math.round(Math.random()*5));
                }
            case "Human":
                switch (Type){
                    case "Fighter":
                        return (int)(Math.round(Math.random()*24)+5);
                    case "Ranger":
                        return (int)(Math.round(Math.random()*24)+5);
                    case "Wizard":
                        return (int)(Math.round(Math.random()*24)+5);
                }
            default:
                return 15;
        }
    }

    //    Classed Based Dexterity
    public static int classBasedDexterity(String Species,String Type){
        switch (Species){
            case "Kobold":
                switch (Type) {
                    case "Common":
                        return 15+(int)(Math.round(Math.random()*5));
                    case "Warrior":
                        return 16+(int)(Math.round(Math.random()*5));
                    case "Shaman":
                        return 15+(int)(Math.round(Math.random()*5));
                    case "Giant":
                        return 14+(int)(Math.round(Math.random()*2));
                }
            case "Goblin":
                switch (Type) {
                    case "Common":
                        return 14+(int)(Math.round(Math.random()*5));
                    case "Archer":
                        return 16+(int)(Math.round(Math.random()*5));
                    case "Hob":
                        return 12+(int)(Math.round(Math.random()*5));
                }
            case "Human":
                switch (Type){
                    case "Fighter":
                        return (int)(Math.round(Math.random()*24)+5);
                    case "Ranger":
                        return (int)(Math.round(Math.random()*24)+5);
                    case "Wizard":
                        return (int)(Math.round(Math.random()*24)+5);
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
                        return 7+(int)(Math.round(Math.random()*2));
                    case "Warrior":
                        return 8+(int)(Math.round(Math.random()*2));
                    case "Shaman":
                        return 10+(int)(Math.round(Math.random()*4));
                    case "Giant":
                        return 8+(int)(Math.round(Math.random()*2));
                }
            case "Goblin":
                switch (Type) {
                    case "Common":
                        return 8+(int)(Math.round(Math.random()*2));
                    case "Archer":
                        return 8+(int)(Math.round(Math.random()*2));
                    case "Hob":
                        return 10+(int)(Math.round(Math.random()*2));
                }
            case "Human":
                switch (Type){
                    case "Fighter":
                        return (int)(Math.round(Math.random()*24)+5);
                    case "Ranger":
                        return (int)(Math.round(Math.random()*24)+5);
                    case "Wizard":
                        return (int)(Math.round(Math.random()*24)+5);
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
                    case "Hob":
                        return HobGoblinWeapons;
                }
            case "Human":
                switch (type){
                    case "Fighter":
                        return FighterWeapons;
                    case "Ranger":
                        return RangerWeapons;
                    case "Wizard":
                        return WizardWeapons;
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
    private static Weapon[] CommonGoblinWeapons = {new PointyStick(),new Mace(),new Dagger(),new RustySpoon()};
    private static Weapon[] ArcherGoblinWeapons = {new ShortBow(),new LightCrossBow()};
    private static Weapon[] HobGoblinWeapons = {new GreatSword(),new HeavyCrossBow()};
    private static Weapon[] RangerWeapons = {new ShortBow(),new LightCrossBow()};
    private static Weapon[] FighterWeapons = {new Spear(),new ShortSword(),new Mace(),new Axe()};
    private static Weapon[] WizardWeapons = {new SpellBook(),new Wand()};









    //        Characters Type Probability
    public static String ETP(String Species){
        String[] KoboldArray = {"Common","Warrior","Shaman","Giant"};
        String[] GoblinArray = {"Common","Archer","Hob"};
        double ran = (Math.random()*10)+1;
        switch (Species){
            case "Kobold":
                if(1 <= ran && ran <= 4){
                    return KoboldArray[0];
                }else if (4 < ran && ran <= 7){
                    return KoboldArray[1];
                }else if (7 < ran && ran <= 9){
                    return KoboldArray[2];
                }else{
                    return KoboldArray[3];
                }
            case "Goblin":
                if (1 <= ran && ran <= 4.5){
                    return GoblinArray[0];
                }else if(4.5 < ran && ran <= 9){
                    return GoblinArray[1];
                }else{
                    return GoblinArray[2];
                }

            default:
                return "Common";
        }

    }

}

