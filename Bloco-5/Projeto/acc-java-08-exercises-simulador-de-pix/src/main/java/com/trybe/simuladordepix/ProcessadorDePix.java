package com.trybe.simuladordepix;

import java.io.IOException;

/**
 * Classe responsável por verificar a chave pix, valor, realizar conexão com servidor fazer pix e
 * fechar conexão.
 *
 * @author caique
 *
 */
public class ProcessadorDePix {

  private final Servidor servidor;

  public ProcessadorDePix(Servidor servidor) {
    this.servidor = servidor;
  }

  /**
   * Executa a operação do pix. Aqui é implementada a lógica de negócio sem envolver as interações
   * do aplicativo com a pessoa usuária.
   *
   * @param valor Valor em centavos a ser transferido.
   * @param chave Chave Pix do beneficiário da transação.
   *
   * @throws ErroDePix Erro de aplicação, caso ocorra qualquer inconformidade.
   * @throws IOException Caso aconteça algum problema relacionado à comunicação entre o aplicativo e
   *         o servidor na nuvem.
   */
  public void executarPix(int valor, String chave) throws ErroDePix, IOException {
    if (valor > 0) {
      Conexao conexao = null;
      try {
        if (chave.isBlank()) {
          throw new ErroChaveEmBranco();
        }
        conexao = this.servidor.abrirConexao();
        String mensagemServidor = conexao.enviarPix(valor, chave);
        if (mensagemServidor.contentEquals(CodigosDeRetorno.SUCESSO)) {
          System.out.println("SUCESSO");
        } else if (mensagemServidor.contentEquals(CodigosDeRetorno.SALDO_INSUFICIENTE)) {
          throw new ErroSaldoInsuficiente();
        } else if (mensagemServidor.contentEquals(CodigosDeRetorno.CHAVE_PIX_NAO_ENCONTRADA)) {
          throw new ErroChaveNaoEncontrada();
        } else {
          throw new ErroInterno();
        }
      } finally {
        if (conexao != null) {
          conexao.close();
        }
      }
    } else {
      throw new ErroValorNaoPositivo();
    }
  }
}
