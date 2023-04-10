package com.trybe.acc.java;

public class Pessoa {

  private String nome;

  public Pessoa(String nome) {
    this.nome = nome;
  }

  public String getNomeUpperCase() {
    return this.nome.toUpperCase();
  }
}