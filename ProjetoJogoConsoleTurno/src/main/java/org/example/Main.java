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
        Enemy stubEnemy = new Enemy();
        Enemy enemyToFight =
                EnemyGenerator.createEnemy(stubEnemy);
//        Enemy enemy1 = new Enemy();
        boolean firstTime = true;
        do {
            System.out.println("Voce tem: " + player1.getGoldValue() + " gold no inventaio");

            if (firstTime){
                Thread.sleep(1500);
                firstTime = false;
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
                System.out.println("You defeated your enemy!");
                Enemy newEnemy = new Enemy();
                enemyToFight =
                        EnemyGenerator.createEnemy(newEnemy);
                System.out.println(Enemy.enemyCount);
            }
            player1.addGoldToInventory(200);
            Thread.sleep(1000);
        } while (player1.hitPoints > 0);
    }


}
