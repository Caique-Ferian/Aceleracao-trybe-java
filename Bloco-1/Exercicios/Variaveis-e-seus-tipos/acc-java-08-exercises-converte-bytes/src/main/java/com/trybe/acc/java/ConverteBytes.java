package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe de representa um coversor de Bytes.
 *
 */
public class ConverteBytes {
  /**
   * Executando conversor de Bytes.
   */
  public static void main(String[] args) {
    // Ler a entrada de um número pelo console
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite um número:");
    byte valor = scan.nextByte();

    // Seu código aqui
    byte qtdBits = (byte) (valor * 8);

    // Imprime a saída no console. OBS: descomente a próxima linha
    System.out.println(valor + " bytes correspondem a " + qtdBits + " bits");

  }
}
