class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x;

    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      x = 5; // This will never execute because condition is always false
    } else {
      x = 10; // This will also never execute because condition is always false
    }

    return x;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}