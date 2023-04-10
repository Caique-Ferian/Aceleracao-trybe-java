package com.trybe.simuladordepix;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.net.SocketTimeoutException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ControladorDePixTest {

  private ProcessadorDePix processador;
  private ControladorDePix controlador;

  @BeforeEach
  public void antes() {
    processador = mock(ProcessadorDePix.class);
    controlador = new ControladorDePix(processador);
  }

  @Test
  @DisplayName("Mensagem de sucesso deve ser exibida corretamente")
  public void mensagemDeSucesso() {
    String mensagem = controlador.aoConfirmarPix(2000, "abc123");
    assertEquals(Mensagens.SUCESSO, mensagem);
  }

  @Test
  @DisplayName("Mensagem de valor não positivo deve ser exibida corretamente")
  public void mensagemDeValorNaoPositivo() throws ErroDePix, IOException {
    doThrow(new ErroValorNaoPositivo()).when(processador).executarPix(anyInt(), anyString());
    String mensagem = controlador.aoConfirmarPix(0, "abc123");
    assertEquals(Mensagens.VALOR_NAO_POSITIVO, mensagem);
  }

  @Test
  @DisplayName("Mensagem de chave em branco deve ser exibida corretamente")
  public void mensagemDeChaveVazia() throws ErroDePix, IOException {
    doThrow(new ErroChaveEmBranco()).when(processador).executarPix(anyInt(), anyString());
    String mensagem = controlador.aoConfirmarPix(2000, " ");
    assertEquals(Mensagens.CHAVE_EM_BRANCO, mensagem);
  }

  @Test
  @DisplayName("Mensagem de saldo insuficiente deve ser exibida corretamente")
  public void mensagemDeSaldoInsuficiente() throws ErroDePix, IOException {
    doThrow(new ErroSaldoInsuficiente()).when(processador).executarPix(anyInt(), anyString());
    String mensagem = controlador.aoConfirmarPix(1000000, "abc123");
    assertEquals(Mensagens.SALDO_INSUFICIENTE, mensagem);
  }

  @Test
  @DisplayName("Mensagem de chave não encontrada deve ser exibida corretamente")
  public void mensagemDeChaveNaoEncontrada() throws ErroDePix, IOException {
    doThrow(new ErroChaveNaoEncontrada()).when(processador).executarPix(anyInt(), anyString());
    String mensagem = controlador.aoConfirmarPix(2000, "(chave não registrada)");
    assertEquals(Mensagens.CHAVE_NAO_ENCONTRADA, mensagem);
  }

  @Test
  @DisplayName("Mensagem de erro interno deve ser exibida corretamente")
  public void mensagemDeErroInterno() throws ErroDePix, IOException {
    doThrow(new ErroInterno()).when(processador).executarPix(anyInt(), anyString());
    String mensagem = controlador.aoConfirmarPix(2000, "abc123");
    assertEquals(Mensagens.ERRO_INTERNO, mensagem);
  }

  @Test
  @DisplayName("Mensagem de erro de conexão deve ser exibida corretamente")
  public void mensagemDeErroDeConexao() throws ErroDePix, IOException {
    doThrow(SocketTimeoutException.class).when(processador).executarPix(anyInt(), anyString());
    String mensagem = controlador.aoConfirmarPix(2000, "abc123");
    assertEquals(Mensagens.ERRO_DE_CONEXAO, mensagem);
  }
}
