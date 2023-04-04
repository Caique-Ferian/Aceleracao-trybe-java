package com.trybe.contapoupanca;

/**
 * Classe que representa uma conta poupança em um dado banco.
 * 
 *
 * @author caique
 *
 */
public class ContaPoupanca {
  private double saldo;
  private String titularConta;

  public ContaPoupanca(String titularConta, double saldo) {
    this.titularConta = titularConta;
    this.saldo = saldo;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void sacar(double valor) {
    this.saldo -= valor;
  }

  public double mostrarSaldo() {
    return this.saldo;
  }

  public String mostrarTitularConta() {
    return this.titularConta;
  }
}
