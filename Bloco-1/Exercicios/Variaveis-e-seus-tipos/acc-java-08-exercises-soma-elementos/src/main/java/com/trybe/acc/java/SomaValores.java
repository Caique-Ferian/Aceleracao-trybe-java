package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe que realiza cálculo da soma de 3 valores informados pelo usuário.
 *
 */
public class SomaValores {
  /**
   * Executa soma dos valores informados pelo usuário.
   */
  public static void main(String[] args) {
    // Ler a entrada de um número pelo console
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    int[] myArray = new int[3];

    // Laço de repetição
    for (int index = 0; index < 3; index++) {
      System.out.println("Digite um número:");
      myArray[index] = scan.nextInt();
    }

    int soma = myArray[0] + myArray[myArray.length - 1];

    // Imprime a saída no console. OBS: descomente a próxima linha
    System.out.println("A soma é: " + soma);

  }

}
