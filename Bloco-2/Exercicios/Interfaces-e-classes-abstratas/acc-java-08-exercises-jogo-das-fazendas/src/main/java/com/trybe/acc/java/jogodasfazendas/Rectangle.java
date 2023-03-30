package com.trybe.acc.java.jogodasfazendas;

/**
 * Classe que representa um Retângulo.
 *
 * @author caique
 *
 */
public class Rectangle extends Polygon {

  public Rectangle(double base, double height) {
    super(base, height);
  }

  @Override
  public double area() {
    return this.base * this.height;
  }
}
