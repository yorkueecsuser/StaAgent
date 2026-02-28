class Parent {
  @Override
  public boolean equals(Object o) {
    // Introducing an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute because there's no other path to reach it
      System.out.println("This is another unreachable block");
    }
    return false;
  }

  public void blargh() {}

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}