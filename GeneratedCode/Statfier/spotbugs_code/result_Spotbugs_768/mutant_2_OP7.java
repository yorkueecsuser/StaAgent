class Ideas_2011_05_26 {

  public boolean standardEquals(Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return this == o;
  }

  static class Inner extends Ideas_2011_05_26 {
    @Override
    public boolean equals(Object o) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return standardEquals(o);
    }
  }

  private boolean getCondition() {
    return false;
  }
}