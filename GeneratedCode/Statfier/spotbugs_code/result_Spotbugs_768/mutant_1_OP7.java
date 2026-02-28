class Ideas_2011_05_26 {

  public boolean standardEquals(Object o) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return this == o;
  }

  static class Inner extends Ideas_2011_05_26 {
    @Override
    public boolean equals(Object o) {
      // Inserting an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
      return standardEquals(o);
    }
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This will ensure the loop is unreachable
  }
}