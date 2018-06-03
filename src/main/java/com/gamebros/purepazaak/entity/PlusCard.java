package com.gamebros.purepazaak.entity;

public class PlusCard implements CardInterface {
  protected int value;

  public PlusCard(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public String getImagePath() {
    return "cards/plus.png";
  }
}

