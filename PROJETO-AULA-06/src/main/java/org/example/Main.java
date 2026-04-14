package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String  nomeAluno = scanner.nextLine();
        System.out.printf("Digite a primeira nota");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2)/2;
        String situacao;
        if(media >= 7.0){
            situacao = "Aprovado";
        } else if (media >= 5.0) {
            situacao = "Recuperacao";
        } else {
            situacao = "Reprovado";
        }
        infoAluno(nomeAluno, media, situacao);
        scanner.nextLine();
        if(situacao.equals("Recuperacao")){
            System.out.println("Deseja adicionar nota de " +
                    "recuperacao?");
            String confirm = scanner.nextLine();
            while(!confirm.equals("s") && !confirm.equals(
                    "n") ) {
                System.out.println("Por favor, digite uma" +
                        " opcao valida");
                confirm = scanner.nextLine();
            }
                if (confirm.equals("s")){
                    double[] notas = {nota1, nota2};

                    double maxOfTwo = Math.max(nota1,
                            nota2);
//                    ArrayList
                    double maiorNota =
                            Arrays.stream(notas).max().getAsDouble();
//                    for (int i = 0; i < notas.length ; i++) {
//                        if(notas[i] == maxOfTwo){
//                            maiorNota  += notas[i];
//                        }
//                    }
//                    int index = notas.;
                    System.out.printf("Digite a nota da " +
                            "recuperacao");
                    double novaNota = scanner.nextDouble();
                    double novaMedia =
                            (maiorNota + novaNota)/2;
                    if (novaMedia >= 7){
                        if(novaMedia > 10){
                            novaMedia = 10;
                        }
                        String novaSituacao = "Aprovado";
                        infoAluno(nomeAluno, novaMedia,
                                novaSituacao);
                    } else {
                        String novaSituacao = "Reprovado";
                        infoAluno(nomeAluno, novaMedia,
                                novaSituacao);
                    }


                }
            }
        }
    public static void infoAluno(String nomeAluno,
                               double media,
                          String situacao){
        System.out.printf("Nome do aluno: %s%n" +
                        "Media do aluno: %.2f%n" +
                        "Status do aluno: %s%n",
                nomeAluno, media,
                situacao);
    }
}

