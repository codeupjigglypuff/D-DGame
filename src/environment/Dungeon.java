
package environment;

import Enemy.Enemy;

// generic dungeon model for other rooms.
public class Dungeon {
// boolean for exits. will be set as rooms are created
    private boolean exitNorth;
    private boolean exitEast;
    private boolean exitSouth;
    private boolean exitWest;
// string telling where the exits can be seen.
    private String northExit = "Upon your initial scan of the room you see that there is an exit " +
        "to the North." ;
    private String eastExit = "Upon your initial scan of the room you see that there is an exit " +
            "to the East." ;
    private String southExit = "Upon your initial scan of the room you see that there is an exit " +
            "to the South.";
    private String westExit = "Upon your initial scan of the room you see that there is an exit " +
            "to the West.";
    // descriptions, objects, and enemies will be set as rooms are created
    private String description;
    private String hiddenDescription;
    private String[] objects;
    private String[] hiddenObjects;
    private Enemy[] enemies;
    private String[] hiddenEnemies;



    public Dungeon(boolean exitNorth,
                   boolean exitEast,
                   boolean exitSouth,
                   boolean exitWest
                   ) {
        this.exitNorth = exitNorth;
        this.exitEast = exitEast;
        this.exitSouth = exitSouth;
        this.exitWest = exitWest;

    }

    public boolean getExitNorth() {
        return exitNorth;
    }

    public void setExitNorth(boolean exitNorth) {
        this.exitNorth = exitNorth;
    }

    public boolean getExitEast() {
        return exitEast;
    }

    public void setExitEast(boolean exitEast) {
        this.exitEast = exitEast;
    }

    public boolean getExitSouth() {
        return exitSouth;
    }

    public void setExitSouth(boolean exitSouth) {
        this.exitSouth = exitSouth;
    }

    public boolean getExitWest() {
        return exitWest;
    }

    public void setExitWest(boolean exitWest) {
        this.exitWest = exitWest;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHiddenDescription() {
        return hiddenDescription;
    }

    public void setHiddenDescription(String hiddenDescription) {
        this.hiddenDescription = hiddenDescription;
    }

    public String[] getObjects() {
        return objects;
    }

    public void setObjects(String[] objects) {
        this.objects = objects;
    }

    public String[] getHiddenObjects() {
        return hiddenObjects;
    }

    public void setHiddenObjects(String[] hiddenObjects) {
        this.hiddenObjects = hiddenObjects;
    }

    public Enemy[] getEnemies() {
        return enemies;
    }

    public void setEnemies(Enemy[] enemies) {
        this.enemies = enemies;
    }

    public String[] getHiddenEnemies() {
        return hiddenEnemies;
    }

    public void setHiddenEnemies(String[] hiddenEnemies) {
        this.hiddenEnemies = hiddenEnemies;
    }

//    exit getters for strings. just returns strings for exit description.

    public String getNorthExit() {
        return northExit;
    }

    public String getEastExit() {
        return eastExit;
    }

    public String getSouthExit() {
        return southExit;
    }

    public String getWestExit() {
        return westExit;
    }
}
