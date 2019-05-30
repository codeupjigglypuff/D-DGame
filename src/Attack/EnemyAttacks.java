package Attack;

import Enemy.Enemy;
import util.Input;

import java.util.ArrayList;

public class EnemyAttacks {



    public void attackSQ(Enemy Hero,Enemy Enemy1,Enemy Enemy2,Enemy Enemy3){
        Input scan = new Input();
        ArrayList<Enemy> attackingEnemys = new ArrayList<>();
        attackingEnemys.add(Enemy1);
        attackingEnemys.add(Enemy2);
        attackingEnemys.add(Enemy3);

//        Attack method
        while (Hero.hth > 0 || attackingEnemys.size() > 0){
            int heroattack = Hero.Attacks();
            attackingEnemys.get(0).hth -= heroattack;
            System.out.println(Hero.name+" Attacked "+attackingEnemys.get(0).name+" for "+heroattack+" Damage");
            if (attackingEnemys.get(0).hth <= 0){
                System.out.println(attackingEnemys.get(0).name+" has been killed");
                attackingEnemys.remove(0);
                System.out.println("You move to you next enemy "+attackingEnemys.get(0).name+" " +
                        "who has "+attackingEnemys.get(0).hth+" health");
            }else {
                System.out.println(attackingEnemys.get(0).name + " now has " + attackingEnemys.get(0).hth + " health.");
            }
            scan.getString();















        }
        System.out.println("You have killed all the enemies");
    }
}
