class Ideas_2011_05_26 {

  public boolean standardEquals(Object o) {
    return this == o;
    // Mutant: Duplicating the return statement
    return this == o;
  }

  static class Inner extends Ideas_2011_05_26 {
    @Override
    public boolean equals(Object o) {
      return standardEquals(o);
      // Mutant: Duplicating the return statement
      return standardEquals(o);
    }
  }
}