class Ideas_2011_05_26 {

  public boolean standardEquals(Object o) {
    return this == o;
  }

  static class Inner extends Ideas_2011_05_26 {
    @Override
    public boolean equals(Object o) {
      // Introducing an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be reached because condition is always false
          System.out.println("This is an unreachable case.");
          break;
        default:
          // Default case
          break;
      }
      return standardEquals(o);
    }

    private boolean getCondition() {
      // This method ensures the condition is always false
      return false;
    }
  }
}