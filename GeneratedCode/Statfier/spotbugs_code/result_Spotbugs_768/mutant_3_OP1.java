class Ideas_2011_05_26 {

  public boolean standardEquals(Object o) {
    return this == o;
    // Mutant: Dead Store
    String abcdefgh = "unusedVariable";
  }

  static class Inner extends Ideas_2011_05_26 {
    @Override
    public boolean equals(Object o) {
      return standardEquals(o);
      // Mutant: Dead Store
      int ijklmnop = 42;
    }
  }
}