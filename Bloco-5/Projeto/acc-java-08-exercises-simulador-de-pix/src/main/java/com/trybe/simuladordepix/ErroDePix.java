package com.trybe.simuladordepix;

/**
 * Classe que representa erros de PIX.
 *
 * @author caique
 *
 */
public abstract class ErroDePix extends Exception {

  private static final long serialVersionUID = 1L;

  public ErroDePix(String mensagem) {
    super(mensagem);
  }
}
