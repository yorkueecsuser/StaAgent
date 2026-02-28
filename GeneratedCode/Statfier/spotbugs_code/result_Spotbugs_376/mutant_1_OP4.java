class Bug2357128 {
  @Override
  public boolean equals(Object obj) {
    // Original code
    return false;

    // Mutant code: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will also never execute because shouldRun is always false
      System.out.println("This is an unreachable else block");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}