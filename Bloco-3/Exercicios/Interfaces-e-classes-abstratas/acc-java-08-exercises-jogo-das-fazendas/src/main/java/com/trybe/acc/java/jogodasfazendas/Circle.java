package com.trybe.acc.java.jogodasfazendas;

/**
 * Classe que representa um Círculo.
 *
 * @author caique
 *
 */
public class Circle implements Farm {
  private static final double PI = 3.14;
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double area() {
    return Circle.PI * (Math.pow(this.radius, 2));
  }
}
