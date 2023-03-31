package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

/**
 * Classe responsável por contabilizar os votos.
 *
 * @author caique
 *
 */
public class GerenciamentoVotacao {
  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<PessoaEleitora> pessoasEleitoras;
  private ArrayList<String> cpfComputado;
  private int totalVotos;

  /**
   * Construtor padrão inicializando o array de pessoas e cpfs, para não haver dupla votação ou
   * duplo cadastro de pessoa candidata.
   */
  public GerenciamentoVotacao() {
    this.pessoasCandidatas = new ArrayList<PessoaCandidata>();
    this.pessoasEleitoras = new ArrayList<PessoaEleitora>();
    this.cpfComputado = new ArrayList<String>();
  }

  /**
   * Método responsável por cadastrar no sistema uma pessoa candidata.
   *
   * @param nome
   *
   * @param numero
   *
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    ArrayList<Integer> pessoasCandidatasNumeros = new ArrayList<Integer>();
    this.pessoasCandidatas.forEach((e) -> pessoasCandidatasNumeros.add(e.getNumero()));
    if (pessoasCandidatasNumeros.contains(numero)) {
      System.out.println("Número pessoa candidata já utilizado!");
    } else {
      PessoaCandidata pc = new PessoaCandidata(nome, numero);
      this.pessoasCandidatas.add(pc);
    }
  }

  /**
   * Método responsável por cadastrar no sistema uma pessoa eleitora.
   *
   * @param nome
   *
   * @param cpf
   *
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    ArrayList<String> pessoasEleitorasCpfs = new ArrayList<String>();
    this.pessoasEleitoras.forEach((e) -> pessoasEleitorasCpfs.add(e.getCpf()));
    if (pessoasEleitorasCpfs.contains(cpf)) {
      System.out.println("Pessoa eleitora já cadastrada!");
    } else {
      PessoaEleitora pe = new PessoaEleitora(nome, cpf);
      this.pessoasEleitoras.add(pe);
    }
  }

  /**
   * Método responsável por cadastrar no sistema o voto de uma pessoa eleitora.
   *
   * @param cpfPessoaEleitora
   *
   * @param numeroPessoaCandidata
   *
   */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (this.cpfComputado.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
    } else {
      for (PessoaCandidata candidato : this.pessoasCandidatas) {
        if (candidato.getNumero() == numeroPessoaCandidata) {
          candidato.receberVoto();
          this.totalVotos += 1;
        }
      }
      this.cpfComputado.add(cpfPessoaEleitora);
    }
  }

  /**
   * Classe responsável por exibir o resultado da votação.
   */
  public void mostrarResultado() {
    for (PessoaCandidata pc : this.pessoasCandidatas) {
      System.out.println("Nome: " + pc.getNome() + " - " + pc.getVotos() + " votos" + " ( "
          + ((float) pc.getVotos() / this.totalVotos) * 100 + "%" + " )");
    }
    System.out.println("Total de votos: " + this.totalVotos);

  }
}
