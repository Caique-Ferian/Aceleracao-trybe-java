package com.trybe.idadeemdias;

import java.util.Scanner;

/**
 * Classe que executará os métodos da classe Pessoa.
 *
 */
public class Main {
  /**
   * Pegando informações do usuário e executando método da classe Pessoa
   * para exibir idade em dias.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] inputs = {"Qual é o seu nome?", "Qual é sua idade em anos, meses e dias?", "anos:",
        "meses:", "dias"};
    String[] values = new String[4];
    for (int i = 0; i < inputs.length; i += 1) {
      System.out.println(inputs[i]);
      if (i == 0) {
        values[i] = scanner.next();

      } else if (i != 1) {
        values[i - 1] = scanner.next();

      }
    }
    String nome = values[0];
    int anos = Integer.parseInt(values[1]);
    int meses = Integer.parseInt(values[2]);
    int dias = Integer.parseInt(values[3]);
    Pessoa pessoa = new Pessoa();
    System.out.println("Olá " + nome + ',' + " sua idade em dias é "
        + pessoa.calcularIdadeEmDias(anos, meses, dias));
  }

}
