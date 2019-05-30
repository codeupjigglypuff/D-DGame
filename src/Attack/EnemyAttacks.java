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
        int killer = 0;

//        Attack method
        while (Hero.hth >= 0 && attackingEnemys.size() > 0){
            int heroattack = Hero.Attacks();
            attackingEnemys.get(0).hth -= heroattack;
            System.out.println("You attack "+attackingEnemys.get(0).name+" for "+Hero.dmg+" Damage\nYou managed to damage "+attackingEnemys.get(0).name+" for "+heroattack+".");
            if (attackingEnemys.get(0).hth <= 0){
                System.out.println("You killed "+attackingEnemys.get(0).name+".");
                attackingEnemys.remove(0);
                System.out.println("\nYou inspect your next enemy \n\n"+attackingEnemys.get(0).inspect());
            }else {
                System.out.println(attackingEnemys.get(0).name + " now has " + attackingEnemys.get(0).hth + " health.");
            }
            scan.getString();
            for (int i = 0;i < attackingEnemys.size(); i++){

                int enemyattack = attackingEnemys.get(i).Attacks();
                Hero.hth -= enemyattack;
                System.out.print(attackingEnemys.get(i).name+" attacks you for "+attackingEnemys.get(i).dmg+"\n" +
                        attackingEnemys.get(i).name+" damaged you for "+enemyattack+"\n");
                if (Hero.hth <= 0){
                    killer = i;
                    System.out.println("You have been killed");

                }else {
                    System.out.println("You now have "+Hero.hth+" health.\n");
                }
                scan.getString();
            }















        }
        if (Hero.hth > 0) {
            System.out.println("You have killed all the enemies in the room");
        }else{
            System.out.println("You have Succumbed to "+attackingEnemys.get(killer).name);
        }
    }
}
