package Attack;

import Enemy.Enemy;

public class EnemyAttacks {



    public void attackSQ(Enemy Hero,Enemy Enemy1,Enemy Enemy2,Enemy Enemy3){
        Enemy[] attackingEnemys = {Enemy1,Enemy2,Enemy3};
//        Attack method
        while (Hero.hth > 0 || attackingEnemys.length > 0){
            int heroattack = Hero.Attacks();
            attackingEnemys[0].hth -= heroattack;
            System.out.println(Hero.name+"Attacked "+attackingEnemys[0].name+" for "+heroattack+" Damage");
            System.out.println(attackingEnemys[0].name+" now has "+attackingEnemys[0].hth);















        }
    }
}
