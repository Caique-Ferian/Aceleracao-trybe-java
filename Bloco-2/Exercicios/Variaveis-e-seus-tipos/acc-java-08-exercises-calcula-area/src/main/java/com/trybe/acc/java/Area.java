package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe que representa um cálculo de área de uma quadrado. *
 *
 */
public class Area {
  /**
   * execução do calculo da área.
   */
  public static void main(String[] args) {

    // Ler a entrada de um número pelo console
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite a medida do lado do quadrado:");
    double lado = scan.nextDouble();
    double area = Math.pow(lado, 2);
    // Seu código aqui


    // Imprime a saída no console. OBS: descomente a próxima linha
    System.out.println("A area do quadrado de lado " + lado + " é igual a " + area);
  }
}
