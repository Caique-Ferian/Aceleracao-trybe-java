package com.trybe.simuladordepix;

import java.io.Closeable;
import java.io.IOException;

/**
 * Interface que define o que é necessário para uma conexão com o servidor nessa aplicação.
 *
 * @author caique
 *
 */
public interface Conexao extends Closeable {

  String enviarPix(int valor, String chave) throws IOException;
}
