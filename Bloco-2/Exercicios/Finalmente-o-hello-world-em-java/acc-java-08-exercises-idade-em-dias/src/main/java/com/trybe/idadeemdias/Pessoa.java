package com.trybe.idadeemdias;

/**
 * Classe representa uma Pessoa.
 *
 */
public class Pessoa {

  public int calcularIdadeEmDias(int anos, int meses, int dias) {
    return (anos * 365) + (meses * 30) + dias;
  }

}
