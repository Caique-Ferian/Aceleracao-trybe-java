package com.trybe.simuladordepix;

/**
 * Classe de erro custom para valor não positivo.
 *
 * @author caique
 *
 */
public class ErroValorNaoPositivo extends ErroDePix {

  private static final long serialVersionUID = 1L;

  public ErroValorNaoPositivo() {
    super(Mensagens.VALOR_NAO_POSITIVO);
  }

}
