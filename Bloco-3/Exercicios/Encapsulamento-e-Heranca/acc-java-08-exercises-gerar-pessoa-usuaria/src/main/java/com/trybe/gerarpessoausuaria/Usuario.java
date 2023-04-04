package com.trybe.gerarpessoausuaria;

/**
 * Classe que representa um Usuário.
 *
 * @author caique
 *
 */
public class Usuario extends Pessoa {

  public Usuario(String nome, String sobrenome) {
    super(nome, sobrenome);
  }

  /**
   * Método para pegar o nome e sobrenome do usuário.
   *
   */
  public String getUsuario() {
    if ((super.nome == null || super.nome.isEmpty())
        || (super.sobrenome == null || super.sobrenome.isEmpty())) {
      return "Usuário inválido";
    }
    return super.nome + '.' + super.sobrenome;
  }
}
