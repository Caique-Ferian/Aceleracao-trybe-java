package com.trybe.acc.java;

/**
 * Classe que representa um cálculo de fatorial.
 *
 */
public class Fatorial {

  /**
   * Método que executa calculo de Fatorial.
   */
  public static void main(String[] args) {
    // Seu código aqui

    long fatorial18 = 1L;

    for (int i = 1; i <= 18; i += 1) {
      fatorial18 *= i;
    }

    // Imprime a saída no console. OBS: descomente a próxima linha
    System.out.println("O fatorial de 18 é igual a " + fatorial18);

  }

}
