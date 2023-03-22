package com.trybe.acc.java.numerosaleatorios;

import java.util.Random;

/**
 * Classe que imprime valores aleatórios de 1 a 5.
 * 
 */
public class NumerosAleatorios {
  /**
   * Método principal para a execuçao do código.
   * 
   */
  public static void main(String[] args) {
    // Seu código vai aqui
    int numero = numeroAleatorio();
    while (numero != 4) {
      imprime(numero);
      numero = numeroAleatorio();
    }
    imprime(numero);
  }

  // Chame a função escrevendo `imprime()`.
  static void imprime(int numero) {
    System.out.println(numero);
  }

  // Chame a função escrevendo `numeroAleatorio()`.
  static int numeroAleatorio() {
    return numerosAleatorios.entreUmECinco();
  }

  static NumerosAleatorios numerosAleatorios = new NumerosAleatorios();

  int entreUmECinco() {
    return new Random().nextInt(5) + 1;
  }
}
