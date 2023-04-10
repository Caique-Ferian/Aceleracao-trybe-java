package com.trybe.simuladordepix;

import java.io.IOException;

/**
 * Interface que define o que um servidor deve ter para ser considera um servidor nessa aplicação.
 *
 * @author caique
 *
 */
public interface Servidor {

  Conexao abrirConexao() throws IOException;
}
