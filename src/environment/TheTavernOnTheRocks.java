
package environment;

import util.Input;

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

    private String aHalflingApproaches = (
            "From the crowd you can see a disturbance but you can’t see the cause. People shuffle\n" +
            "apart and merge again like weeds being parted by a scampering mole-rat. Curiously,\n" +
            "the disturbance moves in your direction when suddenly you see the \n" +
            "particularly fat yet small man with a strange brass contraption fixed around his\n " +
            "head. He peers up at you and says “Ah, there you are!”. The little person looks up\n" +
            "at  you as he pulls a parchment out from his cloak. Dread creeps up from your knees\n" +
            "to your chest. You wonder whom you have offended this time. “When I heard a brave\n" +
            "looking sort was here I knew I’d recognize you on site,” he continues, “I have a map\n" +
            "to a stash of riches that was left in a kobold infested cave near here.. Alas, I am\n" +
            "too little to take on a horde of kobolds, but I am willing to sell this to you for\n" +
            "a measly 100 gold coins. You can keep the riches, I am just looking to pay off my\n " +
            "tab at the tavern!”\n \n What do you do?"
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
        Input sc = new Input();
        if (isFirstTime()){
            setFirstTime(false);
            System.out.println(getFirstTimeDiscription());
            this.searchExits();

            System.out.println("Hit enter to continue");
            sc.getString();

            System.out.println(this.aHalflingApproaches);



            return;
        }
        System.out.println(getDescription());
        this.searchExits();
    }


}

