class Ideas_2011_05_26 {

  public boolean standardEquals(Object o) {
    return this == o;
  }

  static class Inner extends Ideas_2011_05_26 {
    @Override
    public boolean equals(Object o) {
      return standardEquals(o);
    }
  }

  // Mutated code
  public boolean standardEquals(Object x) {
    return this == x;
  }

  static class Inner2 extends Ideas_2011_05_26 {
    @Override
    public boolean equals(Object x) {
      return standardEquals(x);
    }
  }
}