package org.example;

import java.util.Scanner;
import entities.*;
public class Main {
//    main()
    static void main() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao vitaolike");
        System.out.println("Qual o nome do seu personagem?");
        String nomePersonagem = scanner.nextLine();
        Player player1 = new Player(nomePersonagem);
//        Enemy stubEnemy = new Enemy();
        Enemy enemyToFight = EnemyGenerator.createEnemy();

        boolean firstTime = true;
        do {
            if (firstTime){
                Thread.sleep(1500);
                firstTime = false;
            }
            System.out.println("test git");
//            scanner.nextLine();
            player1.addGoldToInventory(200);
            if (enemyToFight.getEnemyCount() % 5 == 0){
                System.out.printf("Would you like to access to shop?");
                String accessShop = scanner.nextLine();
                if(accessShop.equals("y")){
                    int shopOption = -1;
                    int randomNumber = (int) (Math.random() * 10);
                    while(shopOption != 3){
                        System.out.println("You currently have: " + player1.getGoldFromInventory() + " Gold.");
                        shopMenu(randomNumber);
                        shopOption = scanner.nextInt();
                        scanner.nextLine();
                        switch (shopOption){
                            case 1:
                                if(player1.getGoldFromInventory() < 10){
                                    System.out.println("No gold available");
                                    break;
                                } else {
                                    player1.removeGoldFromInventory(10);
                                    System.out.println("You incresed your attack by " + randomNumber + " points!");
                                    player1.increaseAttack(randomNumber);
                                }
                                break;
                            case 2:
                                if(player1.getGoldFromInventory() < 100){
                                    System.out.println("No Gold Available");
                                    break;
                                } else {
                                    player1.removeGoldFromInventory(100);
                                    System.out.println("You healed to full!");
                                    player1.hitPoints = 100;
                                }
                                break;

                        }
                    }
                }


            }
            System.out.println("Voce esta lutando contra " + enemyToFight.enemyName);
            System.out.println(enemyToFight.enemyName + " HP " +
                    "atual: " + enemyToFight.hitpoints);
            System.out.println(player1.name + " HP atual: " + player1.hitPoints);
            System.out.println("O que deseja fazer?");
            player1.playerActions();
            int playerChoice = scanner.nextInt();
            int playerEscolha = player1.playerSwitchActions(player1, playerChoice);
            player1.playerChoose(player1, enemyToFight,
                    playerEscolha);
            System.out.println("Enemy is taking an action...");
            Thread.sleep(800);
            enemyToFight.enemyChoose(player1, enemyToFight);
            Thread.sleep(800);
            if(enemyToFight.hitpoints <= 0){
                player1.addGoldToInventory(enemyToFight.dropGold());
                System.out.println("You defeated your enemy!");
                enemyToFight = EnemyGenerator.createEnemy();
                System.out.println(Enemy.enemyCount);
            }
            Thread.sleep(1000);
        } while (player1.hitPoints > 0);
    }

    public static void shopMenu(int attackIncrease){
        System.out.println("---- BEM VINDO A ABERTURA DO SHOPPING ----");
        System.out.println("1 - BUY " + String.format("%d", attackIncrease) + " ATTACK - 10 Gold");
        System.out.println("2 - HEAL TO FULL - 100 Gold");
        System.out.println("3 - EXIT");
    }

}
