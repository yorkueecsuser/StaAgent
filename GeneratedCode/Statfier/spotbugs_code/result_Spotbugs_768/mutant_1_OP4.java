class Ideas_2011_05_26 {

  public boolean standardEquals(Object o) {
    return this == o;
  }

  static class Inner extends Ideas_2011_05_26 {
    @Override
    public boolean equals(Object o) {
      // Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block will never execute because condition is always false
        System.out.println("This is an unreachable block");
      } else {
        // This block will always execute
        return standardEquals(o);
      }
    }

    private boolean getCondition() {
      // This method returns false, making the if block unreachable
      return false;
    }
  }
}