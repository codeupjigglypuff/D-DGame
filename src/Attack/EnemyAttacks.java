package Attack;

import Enemy.Enemy;
import util.Input;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class EnemyAttacks {



    public void attackSQ(Enemy Hero,Enemy Enemy1,Enemy Enemy2,Enemy Enemy3){
        Input scan = new Input();
//        Enemy's are listed in array list for easier manipulation.
        ArrayList<Enemy> attackingEnemys = new ArrayList<>();
//        Adds all attacking enemy's
        attackingEnemys.add(Enemy1);
        attackingEnemys.add(Enemy2);
        attackingEnemys.add(Enemy3);
//        the int "killer" is for IDing the hero's killer
        int killer = 0;
        boolean negatedalldamage = false;

//        The while loop below is for continuing the attack sequence untill either the enemy of hero has died
        while (Hero.hth >= 0 && attackingEnemys.size() > 0){
            if (Hero.hth <= 0){break;}
            int enemyArmorClass = attackingEnemys.get(0).arm.getArmorClass();
            int heroattack = Hero.Attacks();
                if (!(enemyArmorClass == 0)){
                    int enemyArmorBuff = enemyArmorClass-10;
                    heroattack -= enemyArmorBuff;
                    attackingEnemys.get(0).hth -= heroattack;
                        if (heroattack <= 0){
                            System.out.println("You attack " + attackingEnemys.get(0).name + " for " + Hero.dmg + " Damage\nHowever "+attackingEnemys.get(0).name+"'s "+attackingEnemys.get(0).arm.getName()+" was able\nto negate your attack entirely.\n");
                            negatedalldamage = true;
                        }else{
                            System.out.println("You attack " + attackingEnemys.get(0).name + " for " + Hero.dmg + " Damage\nTheir Armor negated " + enemyArmorBuff + " damage\nBut you managed to damage " + attackingEnemys.get(0).name + " for " + heroattack + ".\n");
                            negatedalldamage = false;
                        }
                }else{
                    attackingEnemys.get(0).hth -= heroattack;
                    System.out.println("You attack " + attackingEnemys.get(0).name + " for " + Hero.dmg + " Damage\nYou managed to damage " + attackingEnemys.get(0).name + " for " + heroattack + ".\n");
                    negatedalldamage = false;
                }
            if (attackingEnemys.get(0).hth <= 0){
                System.out.println("You killed "+attackingEnemys.get(0).name+".");
                attackingEnemys.remove(0);
                System.out.println("\nYou focus on your next enemy \n\n"+attackingEnemys.get(0).inspect());
            }else {
                if (negatedalldamage){
                    System.out.println(attackingEnemys.get(0).name + " still has " + attackingEnemys.get(0).hth + " health.");
                }else {
                    System.out.println(attackingEnemys.get(0).name + " now has " + attackingEnemys.get(0).hth + " health.");
                }
            }
            scan.getString();
            for (int i = 0;i < attackingEnemys.size(); i++){

//                    randomly generates the attack based on their maximum damage.
                    int enemyattack = attackingEnemys.get(i).Attacks();
//                    removes damage done from the Hero's health
                    Hero.hth -= enemyattack;
//                    prints to screen how much damage the hero is taking.
                    System.out.print(attackingEnemys.get(i).name + " attacks you for " + attackingEnemys.get(i).dmg + "\n" +
                            attackingEnemys.get(i).name + " damaged you for " + enemyattack + "\n");
//                    the if statement is for if the hero dies while attacking the enemy.
                        if (Hero.hth <= 0) {
    //                        the statement below allows me to retrieve the killer of the hero.
                            killer = i;
    //                        the statement below stops the enemy from hitting a dead carcass multiple times.
                            System.out.println("You have been killed");
                            break;
                        }else{
    //                        this is the alternative where the hero does not die and keeps living.
                            System.out.println("You now have " + Hero.hth + " health.\n");
                        }
                    scan.getString();

            }















        }
        if (Hero.hth > 0) {
            System.out.println("You have killed all the enemies in the room");
        }else{
//            uses the "killer" int saved when the hero died to let you know who killed the hero.
            System.out.println("You have Succumbed to "+attackingEnemys.get(killer).name);
        }
    }
}
