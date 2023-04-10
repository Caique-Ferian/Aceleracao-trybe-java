package com.trybe.simuladordepix;

/**
 * Classe que simula uma conexão FAKE com um servidor FAKE.
 *
 * @author caique
 *
 */
public class ServidorFake implements Servidor {

  @Override
  public Conexao abrirConexao() {
    return new Conexao() {

      @Override
      public void close() {}

      @Override
      public String enviarPix(int valor, String chave) {
        return CodigosDeRetorno.SUCESSO;
      }
    };
  }
}
