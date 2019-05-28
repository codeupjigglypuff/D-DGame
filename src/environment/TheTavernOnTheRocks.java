
package environment;

public class TheTavernOnTheRocks extends Dungeon{

    private boolean firstTime = false;


    public TheTavernOnTheRocks() {
        super(false, false, true, false);

        this.setDescription(
                "You find yourself in a tavern like many others. Lively, smokey, reeking of ale " +
                        "and men. A foul stench that sticks in your nose long after you have " +
                        "left. You sip on your ale and wonder if another drunken evening awaits you. \n" +
                        "The Tavern is made of a motley crew of bottom dwellers. A company of " +
                        "whom" +
                        " you’ve grown accustom to. Years of bad luck and failed adventures have " +
                        "lead you to this point and you are not sure if it is a good thing or not.  \n"
        );

    }
}

