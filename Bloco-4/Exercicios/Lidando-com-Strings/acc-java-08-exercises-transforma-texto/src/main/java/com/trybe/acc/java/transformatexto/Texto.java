package com.trybe.acc.java.transformatexto;

/**
 * Classe que representa um Texto.
 *
 * @author caique
 *
 */
public class Texto {
  /**
   * Método que transforma todas + em espaços vazios e se indice de primeira letra A for par retorna
   * toda frase em maiúscula.
   *
   * @param frase
   *
   * @return
   */
  public String transformaTexto(String frase) {
    String newText = frase.replace('+', ' ');
    String[] splitedText = newText.split(" ");
    if (newText.indexOf('a') % 2 == 0) {
      return newText.toUpperCase();
    } else {
      return splitedText[0];
    }
  }
}
