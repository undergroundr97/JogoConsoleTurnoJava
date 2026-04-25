package entities;

import inventory.Inventory;

//module
public class Player {
    public String name;
    public int level;
    private Inventory inventory = new Inventory();
    public double hitPoints;
    public double attack;

    public Player(String name){
        this.name = name;
        this.hitPoints = 100;
        this.attack = 50;
        this.level = 1;
    }
    public void increaseAttack(int randomNumber){
        attack += randomNumber;
    }
    public double playerAttack(){
        return this.attack;
    }
    public void playerHeal(){
        double heal = level * 5;
        this.hitPoints += heal;
    }
     public double hitByEnemy(double enemyDamage){
        return this.hitPoints -= enemyDamage;
    }
    public static void playerActions(){
        System.out.println("1 - ATTACK");
        System.out.println("2 - HEAL");
        System.out.println("3 - PASS");
    }
    public static int playerSwitchActions(Player player, int playerChoice){
        switch (playerChoice) {
            case 1:
                player.playerAttack();
                break;
            case 2:
                player.playerHeal();
                break;
            case 3:
                break;
        }
        return playerChoice;
    }
    public static void playerChoose(Player player,Enemy enemy, int playerChoice){
        if (playerChoice == 1) {
            enemy.hitByEnemy(player.attack);
        } else if (playerChoice == 2){
            System.out.println("Player healed for: " + player.level * 5);
        } else {

        }
    }
    public void addGoldToInventory(double gold){
        this.inventory.addGoldToInventory(gold);
        System.out.println("Voce adicionou " + gold + " " +
                "ao inventario.");
    }
    public void removeGoldFromInventory(double gold){
        inventory.removeGoldFromInventory(gold);
        System.out.println("Voce removeou " + gold + " do inventario.");
    }

    public double  getGoldFromInventory(){
        return this.inventory.goldAvailable();
    }

}
