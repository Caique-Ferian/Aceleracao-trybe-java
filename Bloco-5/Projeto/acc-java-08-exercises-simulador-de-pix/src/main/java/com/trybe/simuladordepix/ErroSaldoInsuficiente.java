package com.trybe.simuladordepix;

/**
 * Erro custom de saldo insuficiente.
 *
 * @author caique
 *
 */
public class ErroSaldoInsuficiente extends ErroDePix {

  private static final long serialVersionUID = 1L;

  public ErroSaldoInsuficiente() {
    super(Mensagens.SALDO_INSUFICIENTE);
  }

}
