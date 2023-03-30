package com.trybe.polimorfismo;

/**
 * Classe que representa um funcionário que é contratado como CLT.
 *
 * @author caique
 *
 */
public class FuncionarioPessoaFisica extends Funcionario {
  public double calcularSalarioLiquido() {
    double salario = super.getSalarioBruto();
    return salario - (salario * 0.2);
  }
}
