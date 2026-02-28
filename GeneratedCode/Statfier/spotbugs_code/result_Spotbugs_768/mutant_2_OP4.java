class Ideas_2011_05_26 {

  public boolean standardEquals(Object o) {
    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      System.out.println("This is an unreachable block");
    } else {
      // Alternative code that will also never be executed
      System.out.println("This is another unreachable block");
    }
    return this == o;
  }

  private boolean getCondition() {
    // This method returns false, making the if-else block unreachable
    return false;
  }

  static class Inner extends Ideas_2011_05_26 {
    @Override
    public boolean equals(Object o) {
      // Inserting unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block will never be executed because condition is always false
        System.out.println("This is an unreachable block in Inner class");
      } else {
        // Alternative code that will also never be executed
        System.out.println("This is another unreachable block in Inner class");
      }
      return standardEquals(o);
    }

    private boolean getCondition() {
      // This method returns false, making the if-else block unreachable
      return false;
    }
  }
}