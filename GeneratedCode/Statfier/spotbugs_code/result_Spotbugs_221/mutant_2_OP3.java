class ConfusingParenting {
  protected int a;

  protected Object b;

  // Mutant code added below
  private boolean getUnreachableCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }

  public void someMethod() {
    // Randomly selected basic block to insert the unreachable if statement
    if (getUnreachableCondition()) {
      // Unreachable code block
      System.out.println("This is an unreachable statement.");
    }
  }
}