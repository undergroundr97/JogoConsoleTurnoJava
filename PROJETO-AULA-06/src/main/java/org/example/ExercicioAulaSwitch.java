package org.example;

import java.util.Scanner;

public class ExercicioAulaSwitch {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        opcoes();
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                media();
                reDo();
                break;
            case 2:
                System.out.println("Digite um numero para" +
                        " saber se o numero e PAR OU " +
                        "IMPAR");
                int numero = scanner.nextInt();
                parImpar(numero);
                scanner.nextLine();
                reDo();
                break;
            case 3:
                System.out.println("Digite a temperatura " +
                        "em Celsius");
                double temp = scanner.nextDouble();
                celsiusToFah(temp);
                reDo();
                break;
            case 4:
                System.out.println("Digite dois numeros");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                calcSimples(a,b);
                reDo();
                break;
            case 5:
                break;

        }
    }
    public static void opcoes(){
        System.out.println("BEM VINDO AO MULTI TOTEM");
        System.out.println("1 - Calcular Media Notas");
        System.out.println("2 - Verificar Numero PAR " +
                "IMPAR");
        System.out.println("3 - Converter Temperatura C " +
                "-> F");
        System.out.println("4 - Calculadora Simples");
        System.out.println("5 - Sair");
    }
    public static void media(){
        Main media = new Main();
        media.main();
    }
    public static void parImpar(int numero){

        if(numero % 2 == 0){
            System.out.println(" O NUMERO INFORMADO E PAR");
        }else {
            System.out.println(" O NUMERO INFORMADO " +
                    "E IMPAR");
        }
    }
    public static void celsiusToFah(double temp){
        double fah = (temp * 9/5) + 32;
        System.out.println("A temperatura de C para F é:" + fah);
    }
    public static void calcSimples(double x, double y){
        double add = x + y;
        double mult = x * y;
        double div = x / y;
        double sub = x - y;
        System.out.printf("A soma dos numeros sao:%.2f %n",
                add);
        System.out.printf("A subtracao dos numeros:%.2f %n",
                sub);

        System.out.printf("A divisao dos numeros:%.2f %n",
                div);
        System.out.printf("A multi dos numeros:%.2f %n",
                mult);
    }
    public static void reDo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja fazer uma nova escolha?");
        System.out.println("1 - Sim");
        System.out.println("2 - Nao");
//        scanner.nextLine();
        while(!scanner.hasNextInt()){
            System.out.println("Opcao invalida");
            scanner.next();
        }
        int opcao = scanner.nextInt();
//        scanner.nextLine();

//        scanner.nextLine();
        while(opcao != 1 && opcao != 2){
            System.out.println("Opcao invalida");
            opcao  = scanner.nextInt();
        }
        if (opcao == 1){
            main();
        } else {
            System.out.printf("Obrigado!");
        }
    }
}
