class Bug2357128 {
  @Override
  public boolean equals(Object obj) {
    // Original code
    return false;

    // Mutated code with unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will also never execute because shouldRun is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if-else block is unreachable
    return false;
  }
}