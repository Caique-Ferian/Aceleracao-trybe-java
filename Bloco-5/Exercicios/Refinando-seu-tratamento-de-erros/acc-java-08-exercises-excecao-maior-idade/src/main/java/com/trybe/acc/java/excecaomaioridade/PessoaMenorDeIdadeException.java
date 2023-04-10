package com.trybe.acc.java.excecaomaioridade;

/**
 * Classe que representa um erro customizado caso idade da pessoa for menor que 18.
 *
 * @author caique
 *
 */
public class PessoaMenorDeIdadeException extends Exception {

  private static final long serialVersionUID = 1L;

  public PessoaMenorDeIdadeException() {
    super("Pessoa deve ter no mínimo 18 anos para entrar no Show.");
  }


}
