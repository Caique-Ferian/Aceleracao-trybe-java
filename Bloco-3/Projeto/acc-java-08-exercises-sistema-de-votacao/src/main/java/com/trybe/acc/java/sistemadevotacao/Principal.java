package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe principal onde é executada a aplicação.
 *
 * @author caique
 *
 */
public class Principal {

  /**
   * Método main.
   *
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao gv = new GerenciamentoVotacao();
    System.out.println("Cadastrar pessoa candidata?" + "\n" + "1 - Sim" + "\n" + "2 - Não" + "\n"
        + "Entre com o número correspondente à opção desejada:");
    short stayInFirstLoop = scanner.nextShort();

    do {
      System.out.println("Entre com o nome da pessoa candidata:");
      String applicantName = scanner.next();
      System.out.println("Entre com o número da pessoa candidata:");
      int applicantNumber = scanner.nextInt();
      gv.cadastrarPessoaCandidata(applicantName, applicantNumber);
      System.out.println("Cadastrar pessoa candidata?" + "\n" + "1 - Sim" + "\n" + "2 - Não" + "\n"
          + "Entre com o número correspondente à opção desejada:");
      stayInFirstLoop = scanner.nextShort();
    } while (stayInFirstLoop == 1);
    System.out.println("Cadastrar pessoa eleitora?" + "\n" + "1 - Sim" + "\n" + "2 - Não" + "\n"
        + "Entre com o número correspondente à opção desejada:");
    short stayInSecondLoop = scanner.nextShort();
    do {
      System.out.println("Entre com o nome da pessoa eleitora:");
      String voterName = scanner.next();
      System.out.println("Entre com o cpf da pessoa eleitora:");
      String voterCpf = scanner.next();
      gv.cadastrarPessoaEleitora(voterName, voterCpf);
      System.out.println("Cadastrar pessoa eleitora?" + "\n" + "1 - Sim" + "\n" + "2 - Não" + "\n"
          + "Entre com o número correspondente à opção desejada:");
      stayInSecondLoop = scanner.nextShort();
    } while (stayInSecondLoop == 1);
    System.out.println("Entre com o número correspondente à opção desejada:" + "\n" + "1 - Votar"
        + "\n" + "2 - Resultado Parcial" + "\n" + "3 - Finalizar Votação");
    short stayInThirdLoop = scanner.nextShort();
    do {
      if (stayInThirdLoop == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String voterCpf = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int applicantNumber = scanner.nextInt();
        gv.votar(voterCpf, applicantNumber);
      } else if (stayInThirdLoop == 2) {
        gv.mostrarResultado();
      }
      System.out.println("Entre com o número correspondente à opção desejada:" + "\n" + "1 - Votar"
          + "\n" + "2 - Resultado Parcial" + "\n" + "3 - Finalizar Votação");
      stayInThirdLoop = scanner.nextShort();
    } while (stayInThirdLoop < 3);
    scanner.close();
    gv.mostrarResultado();
  }

}
