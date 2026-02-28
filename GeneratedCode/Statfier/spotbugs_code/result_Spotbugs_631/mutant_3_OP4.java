class Bug3086136 {

  int x;

  public void setX(int y) {
    int z;
    this.x = x; // Original bug: should be 'this.x = y;'
    z = 32;

    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      z = 42;
    } else {
      // This block will always execute
      z = 52;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}