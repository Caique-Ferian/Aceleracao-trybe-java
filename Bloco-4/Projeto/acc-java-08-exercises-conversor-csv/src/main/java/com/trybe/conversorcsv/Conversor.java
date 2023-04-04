package com.trybe.conversorcsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Classe que converte arquivos CSV'S para um padrão definido.
 *
 * @author caique
 *
 */
public class Conversor {

  /**
   * Função utilizada apenas para validação da solução do desafio.
   *
   * @param args Não utilizado.
   * @throws IOException Caso ocorra algum problema ao ler os arquivos de entrada ou gravar os
   *         arquivos de saída.
   */
  public static void main(String[] args) throws IOException {
    File pastaDeEntradas = new File("./entradas/");
    File pastaDeSaidas = new File("./saidas/");
    new Conversor().converterPasta(pastaDeEntradas, pastaDeSaidas);
  }

  /**
   * Converte todos os arquivos CSV da pasta de entradas. Os resultados são gerados na pasta de
   * saídas, deixando os arquivos originais inalterados.
   *
   * @param pastaDeEntradas Pasta contendo os arquivos CSV gerados pela página web.
   * @param pastaDeSaidas Pasta em que serão colocados os arquivos gerados no formato requerido pelo
   *        subsistema.
   *
   * @throws IOException Caso ocorra algum problema ao ler os arquivos de entrada ou gravar os
   *         arquivos de saída.
   */
  public void converterPasta(File pastaDeEntradas, File pastaDeSaidas) throws IOException {
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    FileWriter fileWriter = null;
    BufferedWriter bufferedWriter = null;
    try {
      for (File f : pastaDeEntradas.listFiles()) {
        fileReader = new FileReader(f);
        bufferedReader = new BufferedReader(fileReader);
        String lineContent = bufferedReader.readLine();
        String result = "";
        while (lineContent != null) {
          if (lineContent.contains("CPF")) {
            result += lineContent + "\n";
          } else {
            String[] lineToConvert = lineContent.split(",");
            result += this.converterConteudoParaPadrao(lineToConvert) + "\n";
          }
          lineContent = bufferedReader.readLine();
        }
        if (!pastaDeSaidas.exists()) {
          pastaDeSaidas.mkdir();

        }
        String[] splitedPath = f.getPath().split("/");
        String path = pastaDeSaidas.getPath() + "/" + splitedPath[splitedPath.length - 1];
        fileWriter = new FileWriter(path);
        bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(result);
        bufferedWriter.flush();
      }
    } catch (

    IOException e) {
      e.printStackTrace();
    } finally {
      fileReader.close();
      bufferedReader.close();
      fileWriter.close();
      bufferedWriter.close();
    }
  }

  private String converterConteudoParaPadrao(String[] conteudo) {
    String nome = conteudo[0].toUpperCase() + ",";
    String[] dataDeNascimentoSplitada = conteudo[1].split("/");
    String dataDeNascimento = dataDeNascimentoSplitada[2] + "-" + dataDeNascimentoSplitada[1] + "-"
        + dataDeNascimentoSplitada[0] + ",";
    String email = conteudo[2] + ",";
    String cpf = conteudo[3].substring(0, 3) + "." + conteudo[3].substring(3, 6) + "."
        + conteudo[3].substring(6, 9) + "-" + conteudo[3].substring(9, 11);
    return nome + dataDeNascimento + email + cpf;
  }

}
