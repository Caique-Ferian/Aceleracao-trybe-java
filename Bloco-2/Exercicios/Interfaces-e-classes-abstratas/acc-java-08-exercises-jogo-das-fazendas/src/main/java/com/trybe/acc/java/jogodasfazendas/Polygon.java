package com.trybe.acc.java.jogodasfazendas;

/**
 * Classe que representa um polígono.
 *
 * @author caique
 *
 */
public abstract class Polygon implements Farm {
  protected double base;
  protected double height;

  public Polygon(double base, double height) {
    this.base = base;
    this.height = height;
  }
}
