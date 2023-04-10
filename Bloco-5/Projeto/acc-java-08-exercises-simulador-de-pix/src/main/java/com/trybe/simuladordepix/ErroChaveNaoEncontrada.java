package com.trybe.simuladordepix;

/**
 * Erro custom de chave PIX não encontrada.
 *
 * @author caique
 *
 */
public class ErroChaveNaoEncontrada extends ErroDePix {

  private static final long serialVersionUID = 1L;

  public ErroChaveNaoEncontrada() {
    super(Mensagens.CHAVE_NAO_ENCONTRADA);
  }
}
