package com.trybe.simuladordepix;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProcessadorDePixTest {

  private Servidor servidor;
  private Conexao conexao;
  private ProcessadorDePix processador;

  @BeforeEach
  public void antes() throws IOException {
    conexao = mock(Conexao.class);
    servidor = mock(Servidor.class);
    when(servidor.abrirConexao()).thenReturn(conexao);
    processador = new ProcessadorDePix(servidor);
  }

  @Test
  @DisplayName("Pix válido deve ser realizado com sucesso")
  public void pixValidoSucesso() throws ErroDePix, IOException {
    when(conexao.enviarPix(anyInt(), anyString()))
        .thenReturn(CodigosDeRetorno.SUCESSO);

    processador.executarPix(2000, "abc123");
  }

  @Test
  @DisplayName("Exceção customizada deve ser lançada caso o valor seja igual a zero")
  public void excecaoCustomizadaValorIgualZero() {
    assertThrows(
        ErroValorNaoPositivo.class,
        () -> processador.executarPix(0, "abc123")
    );
  }

  @Test
  @DisplayName("Exceção customizada deve ser lançada caso o valor seja negativo")
  public void excecaoCustomizadaValorNegativo() {
    assertThrows(
        ErroValorNaoPositivo.class,
        () -> processador.executarPix(-1, "abc123")
    );
  }

  @Test
  @DisplayName("Exceção customizada deve ser lançada caso a chave esteja em branco")
  public void excecaoCustomizadaChaveEmBranco() {
    assertThrows(
        ErroChaveEmBranco.class,
        () -> processador.executarPix(2000, " ")
    );
  }

  @Test
  @DisplayName("Exceção customizada deve ser lançada em caso de saldo insuficiente")
  public void excecaoCustomizadaSaldoInsuficiente() throws IOException {
    when(conexao.enviarPix(anyInt(), anyString()))
        .thenReturn(CodigosDeRetorno.SALDO_INSUFICIENTE);

    assertThrows(
        ErroSaldoInsuficiente.class,
        () -> processador.executarPix(2000, "abc123")
    );
  }

  @Test
  @DisplayName("Exceção customizada deve ser lançada em caso de chave não encontrada")
  public void excecaoCustomizadaChaveNaoEncontrada() throws IOException {
    when(conexao.enviarPix(anyInt(), anyString()))
        .thenReturn(CodigosDeRetorno.CHAVE_PIX_NAO_ENCONTRADA);

    assertThrows(
        ErroChaveNaoEncontrada.class,
        () -> processador.executarPix(2000, "abc123")
    );
  }

  @Test
  @DisplayName("Exceção customizada deve ser lançada em caso de erro interno")
  public void excecaoCustomizadaErroInterno() throws IOException {
    when(conexao.enviarPix(anyInt(), anyString()))
        .thenReturn("(código de retorno não listado)");

    assertThrows(
        ErroInterno.class,
        () -> processador.executarPix(2000, "abc123")
    );
  }

  @Test
  @DisplayName("IOExceptions ao abrir conexão devem ser propagadas")
  public void ioExceptionAoAbrirConexao() throws IOException {
    when(servidor.abrirConexao())
        .thenThrow(SocketTimeoutException.class);

    assertThrows(
        SocketTimeoutException.class,
        () -> processador.executarPix(2000, "abc123")
    );
  }

  @Test
  @DisplayName("IOExceptions ao enviar devem ser propagadas")
  public void ioExceptionAoEnviar() throws IOException {
    when(conexao.enviarPix(anyInt(), anyString()))
        .thenThrow(SocketException.class);

    assertThrows(
        SocketException.class,
        () -> processador.executarPix(2000, "abc123")
    );
  }

  @Test
  @DisplayName("A conexão deve ser fechada após o sucesso da operação")
  public void conexaoFechadaAposSucesso() throws ErroDePix, IOException {
    when(conexao.enviarPix(anyInt(), anyString()))
        .thenReturn(CodigosDeRetorno.SUCESSO);

    processador.executarPix(2000, "abc123");
    verify(conexao).close();
  }

  @Test
  @DisplayName("A conexão deve ser fechada mesmo em caso de erro")
  public void conexaoFechadaAposErro() throws IOException {
    when(conexao.enviarPix(anyInt(), anyString()))
        .thenThrow(SocketException.class);

    assertThrows(
        SocketException.class,
        () -> processador.executarPix(2000, "abc123")
    );

    verify(conexao).close();
  }
}
