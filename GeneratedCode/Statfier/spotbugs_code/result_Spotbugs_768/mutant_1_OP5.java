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
          // This case is unreachable because condition is never true
          System.out.println("This is an unreachable case");
          break;
        case 1:
          // This is the only reachable case
          return standardEquals(o);
      }
      return false;
    }

    private boolean getCondition() {
      // This method always returns false, ensuring the switch is unreachable
      return false;
    }
  }
}