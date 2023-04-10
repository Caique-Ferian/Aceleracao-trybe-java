package com.trybe.acc.java;

/**
 * Classe que representa um Guard de tratamento de erros de instâncias nulas.
 *
 * @author caique
 *
 */
public class NullGuard {

  /**
   * Método do tratamento de erro.
   *
   * @param divisor
   *
   * @return
   *
   */
  public String printName(int divisor) {
    NullGenerator nullGenerator = new NullGenerator();
    try {
      return nullGenerator.getNome(divisor);
    } catch (NullPointerException e) {
      return "Nome nulo";
    }
  }
}
