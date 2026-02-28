class Bug2357128 {
  @Override
  public boolean equals(Object obj) {
    // Original code
    return false;

    // Inserted unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute for the same reason
      System.out.println("This is another unreachable block");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}