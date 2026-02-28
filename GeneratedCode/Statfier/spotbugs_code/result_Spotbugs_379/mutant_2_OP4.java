class Parent {
  @Override
  public boolean equals(Object o) {
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute because shouldRun is always false
      System.out.println("This is another unreachable block");
    }
    return false;
  }

  public void blargh() {}

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}