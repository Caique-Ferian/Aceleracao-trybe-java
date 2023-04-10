package com.trybe.acc.java;

/**
 * Classe que representa uma divisão.
 *
 * @author caique
 *
 */
public class Divisor {

  /**
   * Método que realiza a divisão.
   *
   * @param dividendo
   *
   * @param divisor
   *
   * @return
   *
   */
  public int dividir(int dividendo, int divisor) {
    try {
      return dividendo / divisor;
    } catch (ArithmeticException e) {
      return 0;
    }
  }
}
