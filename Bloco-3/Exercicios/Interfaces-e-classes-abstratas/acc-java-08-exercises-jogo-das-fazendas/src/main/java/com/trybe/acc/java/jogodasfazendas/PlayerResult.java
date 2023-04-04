package com.trybe.acc.java.jogodasfazendas;

/**
 * Classe que representa um jogo de fazenda, que determina quem tem a maior fazenda.
 *
 * @author caique
 *
 */
public class PlayerResult {
  private String playerName;
  private Farm[] farms;

  public PlayerResult(String name, Farm[] farms) {
    this.playerName = name;
    this.farms = farms;
  }

  /**
   * Método que calcula o total de área de uma fazenda de acordo com o array de território
   * informado.
   *
   *
   * @return total
   */
  public double score() {
    double total = 0;
    for (Farm farm : this.farms) {
      total += farm.area();
    }
    return total;
  }

  public String toString() {
    return this.playerName;
  }

}
