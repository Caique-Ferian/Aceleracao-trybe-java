package com.trybe.acc.java;

/**
 * Classe representa as Notas de uma Pessoa.
 *
 */
public class Nota {

  public double calcularMedia(double notaUm, double notaDois, double notaTres, double notaQuatro) {
    return (notaUm + notaDois + notaTres + notaQuatro) / 4;
  }

}
