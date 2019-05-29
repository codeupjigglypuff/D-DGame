
package environment;

public class TheTavernOnTheRocks extends Dungeon{
//  first time visiting this tavern?
    private boolean firstTime = true;
//    hard coded descriptions for this area.
    private String firstTimeDiscription = (
            "You find yourself in a tavern like many others. Lively, smokey, reeking of ale\n " +
                    "and men. A foul stench that sticks in your nose long after you have\n " +
                    "left. You sip on your ale and wonder if another drunken evening awaits you. \n" +
                    "The Tavern is made of a motley crew of bottom dwellers. A company of\n " +
                    "whom" +
                    "you’ve grown accustom to. Years of bad luck and failed adventures have\n " +
                    "lead you to this point and you are not sure if it is a good thing or not.\n"
    );

    private String description = (
            "The tavern is not much better than it was before. Its just as smoky and smelly as\n " +
                    "it was when you were last here. But whatever it is that brings you to this\n" +
                    "place again far exceeds your desire for more accommodating surroundings.\n"
            );

//    constructor calling super class constructor to set exits
    public TheTavernOnTheRocks() {
        super(false, false, true, false);

    }
// getters
    public boolean isFirstTime() {
        return firstTime;
    }

    public String getFirstTimeDiscription() {
        return this.firstTimeDiscription;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
//    setters
    public void setFirstTime(boolean set){
        this.firstTime = set;
    }

//    Methods
//    initial run. After character creation.

    public void enterTavern(){
//        is first time?
        if (isFirstTime()){
            setFirstTime(false);
            System.out.println(getFirstTimeDiscription());

            return;
        }
        System.out.println(getDescription());
    }

}

