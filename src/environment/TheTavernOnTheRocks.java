package environment;

public class TheTavernOnTheRocks extends Dungeon{

    public TheTavernOnTheRocks(boolean exitNorth, boolean exitEast, boolean exitSouth, boolean exitWest) {
        super(false, false, true, false);

        this.setDescription(
                "You find yourself in a tavern like many others. Lively, smokey, reeking of ale " +
                        "and men. A foul stench that sticks in your nose long after you have " +
                        "left. You sip on your ale and wonder if another drunken evening awaits you. \n" +
                        "The Tavern is made of a mottly crue of bottom dwellers. A compy of whom" +
                        " you’ve grown acustom to. Years of bad luck and failed adventures have " +
                        "lead you to this point and you are not sure if it is a good thing or not.  \n"
        );
    }
}
