package org.example;

import java.util.Scanner;
import entities.*;
public class Main {
    static void main() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao vitaolike");
        System.out.println("Qual o nome do seu personagem?");
        String nomePersonagem = scanner.nextLine();
        Player player1 = new Player(nomePersonagem);
        Enemy enemy1 = new Enemy();
        System.out.println("Voce esta lutando contra " + enemy1.enemyName);
        boolean firstTime = true;
        do {
            if (firstTime){
                Thread.sleep(1500);
                firstTime = false;
            }
            System.out.println(enemy1.enemyName + " HP atual: " + enemy1.hitpoints);
            System.out.println(player1.name + " HP atual: " + player1.hitPoints);
            System.out.println("O que deseja fazer?");
            player1.playerActions();
            int playerChoice = scanner.nextInt();
            int playerEscolha = player1.playerSwitchActions(player1, playerChoice);
            player1.playerChoose(player1, enemy1, playerEscolha);
            System.out.println("Enemy is taking an action...");
            Thread.sleep(800);
            enemy1.enemyChoose(player1, enemy1);
            Thread.sleep(800);
            if(enemy1.hitpoints <= 0){
                System.out.println("You defeated your enemy!");
                enemy1 = new Enemy();
                System.out.println(Enemy.enemyCount);
            }
            Thread.sleep(1000);
        } while (player1.hitPoints > 0);
    }


}
