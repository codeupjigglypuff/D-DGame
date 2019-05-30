package Enemy;


import Attack.EnemyAttacks;

public class enmytest {
    public static void main(String[] args) {

        Enemy bob0 = new Kobold();
        Enemy bob1 = new Kobold();
        Enemy bob2 = new Kobold();
        Enemy bob3 = new Kobold();
        Enemy bob4 = new Kobold();
        Enemy bob5 = new Kobold();
        Enemy bob6 = new Kobold();
        Enemy bob7 = new Kobold();
        Enemy gob0 = new Goblin();
        Enemy gob1 = new Goblin();
        Enemy gob2 = new Goblin();
        Enemy gob3 = new Goblin();
        Enemy gob4 = new Goblin();
        Enemy gob5 = new Goblin();


        EnemyAttacks atk = new EnemyAttacks();
        atk.attackSQ(bob0,gob0,gob1,gob2);




    }


}
