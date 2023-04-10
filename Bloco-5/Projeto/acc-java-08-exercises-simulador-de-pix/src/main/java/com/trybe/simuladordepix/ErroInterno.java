package com.trybe.simuladordepix;

/**
 * Erro custom de erro interno no servidor.
 *
 * @author caique
 *
 */
public class ErroInterno extends ErroDePix {

  private static final long serialVersionUID = 1L;

  public ErroInterno() {
    super(Mensagens.ERRO_INTERNO);
  }
}
