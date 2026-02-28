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

  static class Innerb extends Ideas_2011_05_26 {
    @Override
    public boolean equals(Object y) {
      return standardEquals(y);
    }
  }
}