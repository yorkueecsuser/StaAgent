class Ideas_2011_05_26 {

  public boolean standardEquals(Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
    return this == o;
  }

  static class Inner extends Ideas_2011_05_26 {
    @Override
    public boolean equals(Object o) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is another unreachable statement.");
      }
      return standardEquals(o);
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}