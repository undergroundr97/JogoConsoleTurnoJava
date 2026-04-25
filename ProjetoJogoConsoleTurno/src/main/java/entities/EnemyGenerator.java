package entities;

//import entities.*;
//import entities;

import entities.enemyTypes.Archer;
import entities.enemyTypes.Mage;
import entities.enemyTypes.Warrior;

public class EnemyGenerator {
    private static int randomNumber(){
        return (int) (Math.random() * 3);
    }
    public static Enemy createEnemy(){
        int randomNumGen = randomNumber();
        if (randomNumGen == 0){
            return new Enemy();
        } else if (randomNumGen == 1) {
            return new Warrior();
        } else if (randomNumGen == 2){
            return new Mage();
        } else {
            return new Archer();
        }
    }
}
