package com.trybe.polimorfismo;

/**
 * Classe que representa um funcionário que é contratado como PJ.
 *
 * @author caique
 *
 */
public class FuncionarioPessoaJuridica extends Funcionario {
  public double calcularSalarioLiquido() {
    double salario = super.getSalarioBruto();
    return salario - (salario * 0.1);
  }
}
