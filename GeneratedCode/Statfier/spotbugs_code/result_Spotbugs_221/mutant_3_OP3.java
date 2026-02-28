class ConfusingParenting {
  protected int a;

  protected Object b;

  // Mutant code added here
  private boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }

  public void someMethod() {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      a = 10;
      b = new Object();
    }
  }
}