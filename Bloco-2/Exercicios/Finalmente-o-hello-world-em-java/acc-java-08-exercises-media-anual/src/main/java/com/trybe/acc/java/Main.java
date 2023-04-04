package com.trybe.acc.java;

import java.util.Scanner;

/**
 * Classe que executará os métodos da classe Nota.
 *
 */
public class Main {
  /**
   * Pegando informações do usuário e executando método da classe Nota para definir a média de uma
   * dada pessoa.
   *
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] inputs = {"Qual é o seu nome?", "Entre com as notas das provas:", "Avaliação 1:",
        "Avaliação 2:", "Avaliação 3:", "Avaliação 4:"};
    String[] values = new String[5];
    for (int i = 0; i < inputs.length; i += 1) {
      System.out.println(inputs[i]);
      if (i == 0) {
        values[i] = scanner.next();

      } else if (i != 1) {
        values[i - 1] = scanner.next();

      }
    }
    scanner.close();
    String nome = values[0];
    double notaUm = Double.parseDouble(values[1]);
    double notaDois = Double.parseDouble(values[2]);
    double notaTres = Double.parseDouble(values[3]);
    double notaQuatro = Double.parseDouble(values[4]);

    Nota nota = new Nota();

    System.out.println("Olá, " + nome + ',' + " sua média é "
        + nota.calcularMedia(notaUm, notaDois, notaTres, notaQuatro));
  }

}
