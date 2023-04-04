package com.trybe.acc.java.estadosbrasileiros;

import java.util.Random;

/**
 * Classe que nomeia alguns estados do Brasil ao informar sigla.
 * 
 */
public class EstadosBrasileiros {
  /**
   * Método principal para a execuçao do código.
   * 
   */
  public static void main(String[] args) {
    // Sorteia uma UF.
    String[] siglas = {"CE", "SC", "AM"};
    int pos = new Random().nextInt(siglas.length);

    // Mostra o nome do estado.
    mostraNomeEstado(siglas[pos]);
  }

  static void mostraNomeEstado(String uf) {
    // Seu código aqui
    if (uf == "CE") {
      EstadosBrasileiros.imprime("CEARA");
    } else if (uf == "SC") {
      EstadosBrasileiros.imprime("SANTA CATARINA");
    } else {
      EstadosBrasileiros.imprime("AMAZONAS");

    }
  }

  // Chame a função escrevendo `imprime()`.
  static void imprime(String nomeEstado) {
    System.out.println(nomeEstado);
  }
}
