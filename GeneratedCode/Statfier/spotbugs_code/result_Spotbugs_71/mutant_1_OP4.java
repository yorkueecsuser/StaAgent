class Bug1871051 {
  @Override
  public Object clone() {
    // Original code
    return new Bug1871051();

    // Mutated code - Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute because the if condition is always false
      System.out.println("This is another unreachable block");
    }
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}