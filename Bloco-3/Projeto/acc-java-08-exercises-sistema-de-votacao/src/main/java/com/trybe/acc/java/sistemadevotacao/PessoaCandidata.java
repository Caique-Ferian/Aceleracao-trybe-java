package com.trybe.acc.java.sistemadevotacao;

/**
 * Classe que representa uma pessao Candidata.
 *
 * @author caique
 *
 */
public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  /**
   * Construtor padrão para existir uma pessoa candidata.
   *
   * @param nome
   *
   * @param numero
   *
   */
  public PessoaCandidata(String nome, int numero) {
    super(nome);
    this.numero = numero;
    this.votos = 0;
  }

  public String getNome() {
    return super.nome;
  }

  public void setNome(String nome) {
    super.nome = nome;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  public void receberVoto() {
    this.votos += 1;
  }
}
