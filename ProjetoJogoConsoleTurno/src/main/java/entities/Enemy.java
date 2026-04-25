package entities;
import java.util.Random;

public class Enemy {
    public static int enemyCount = 4;
    public String enemyName;
    public double hitpoints;
    public double attack;

    public int getEnemyCount() {
        return enemyCount;
    }

    public Enemy(){

        this.enemyCount += 1;
        this.enemyName = "Enemy" + this.enemyCount;
        this.hitpoints = 20 * this.enemyCount;
        this.attack = 2 * enemyCount;
//        int level = (int) enemyCount * 3;
    }

    public  double dropGold(){
        double randomNumber = Math.random();
        double roundedNumber = (double) Math.round(randomNumber * 100)/100;
        return enemyCount + (roundedNumber * 0.5 );
    }
    public double enemyAttack(){
        return this.attack;
    }
    public double hitByEnemy(double damageTaken){
        return this.hitpoints -= damageTaken;
    }

    public static void enemyChoose(Player player, Enemy enemy){
        int computerChoice = (int) (Math.random() * 2);
        if (computerChoice == 0){
            player.hitByEnemy(enemy.attack);
            System.out.println("Player got hit for " + enemy.attack);
        } else{
            System.out.println("Inimigo não realizou ação");
        }
//        return
    }

}



