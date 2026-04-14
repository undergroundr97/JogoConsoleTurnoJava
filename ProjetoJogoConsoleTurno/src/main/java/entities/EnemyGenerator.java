package entities;

//import entities.*;
//import entities;

import entities.enemyTypes.Archer;
import entities.enemyTypes.Mage;
import entities.enemyTypes.Warrior;

public class EnemyGenerator {
    public static Enemy createEnemy(Enemy enemy){
        if (Enemy.enemyType == 0){
            return new Enemy();
        } else if (Enemy.enemyType == 1) {
            return new Warrior();
        } else if (Enemy.enemyType == 2){
            return new Mage();
        } else {
            return new Archer();
        }
    }
}
