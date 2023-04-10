package com.trybe.simuladordepix;

/**
 * Erro custom para chaves PIX em branco.
 *
 * @author caique
 *
 */
public class ErroChaveEmBranco extends ErroDePix {

  private static final long serialVersionUID = 1L;

  public ErroChaveEmBranco() {
    super(Mensagens.CHAVE_EM_BRANCO);
  }
}
