class Ideas_2011_05_26 {

  public boolean standardEquals(Object o) {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable statement.");
    }
    return this == o;
  }

  private boolean getCondition() {
    // This method ensures the condition is always false
    return false;
  }

  static class Inner extends Ideas_2011_05_26 {
    @Override
    public boolean equals(Object o) {
      // Inserting an unreachable if statement
      boolean condition = getInnerCondition();
      if (condition) {
        // This block is unreachable because getInnerCondition() will never return true
        System.out.println("This is another unreachable statement.");
      }
      return standardEquals(o);
    }

    private boolean getInnerCondition() {
      // This method ensures the condition is always false
      return false;
    }
  }
}