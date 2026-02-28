class Ideas_2011_05_26 {

  public boolean standardEquals(Object o) {
    return this == o;
  }

  static class Inner extends Ideas_2011_05_26 {
    @Override
    public boolean equals(Object o) {
      // Mutant code start
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never execute because shouldRun is always false
        System.out.println("This is an unreachable if block.");
      } else {
        // Some alternative code that will also never execute because shouldRun is always false
        System.out.println("This is an unreachable else block.");
      }
      // Mutant code end
      return standardEquals(o);
    }

    private boolean getCondition() {
      // This method ensures the condition is dynamically determined at runtime and is always false
      return false;
    }
  }
}