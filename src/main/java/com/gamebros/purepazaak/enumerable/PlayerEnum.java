package com.gamebros.purepazaak.enumerable;

public enum PlayerEnum {
  PLAYERONE {
    public PlayerEnum next() {
      return PLAYERTWO;
    }
  },
  PLAYERTWO {
    public PlayerEnum next() {
      return PLAYERONE;
    }
  };

  public abstract PlayerEnum next();
}
