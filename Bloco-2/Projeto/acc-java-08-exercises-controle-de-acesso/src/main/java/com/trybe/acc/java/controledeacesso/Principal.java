package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe que representa um Programa de controle de acesso de um determinado local.
 * 
 */
public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entre com o número correspondente à opção desejada:\n"
        + "1 - Acessar o estabelecimento\n" + "2 - Finalizar sistema e mostrar relatório");
    short option = scanner.nextShort();
    ArrayList<Integer> clients = new ArrayList<Integer>();
    int young = 0;
    int adult = 0;
    int elderly = 0;
    do {
      if (option != 1) {
        System.out.println("Entre com uma opção válida!");
        System.out.println("Entre com o número correspondente à opção desejada:\n"
            + "1 - Acessar o estabelecimento\n" + "2 - Finalizar sistema e mostrar relatório");
        option = scanner.nextShort();
      } else {

        System.out.println("Entre com a sua idade:");
        int age = scanner.nextInt();
        if (age < 18) {
          young += 1;
          System.out.println("Pessoa cliente menor de idade, catraca liberada!");
        } else if (age >= 18 && age <= 49) {
          adult += 1;
          System.out.println("Pessoa adulta, catraca liberada!");
        } else {
          elderly += 1;
          System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
        }
        clients.add(age);
        System.out.println("Entre com o número correspondente à opção desejada:\n"
            + "1 - Acessar o estabelecimento\n" + "2 - Finalizar sistema e mostrar relatório");
        option = scanner.nextShort();
      }
    } while (option != 2);

    float percYoung = ((float) young / clients.size()) * 100;
    float percAdult = ((float) adult / clients.size()) * 100;
    float percElderly = ((float) elderly / clients.size()) * 100;
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("----- Quantidade -----\n" + "menores: " + young + "\n" + "adultas: " + adult
        + "\n" + "a partir de 50: " + elderly + "\n" + "\n" + "----- Percentual -----\n"
        + "menores: " + df.format(percYoung) + "%" + "\n" + "adultas: " + df.format(percAdult) + "%"
        + "\n" + "a partir de 50: " + df.format(percElderly) + "%" + "\n" + "\n" + "TOTAL: "
        + (young + adult + elderly));


  }
}
