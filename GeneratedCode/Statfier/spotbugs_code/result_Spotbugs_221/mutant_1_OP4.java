class ConfusingParenting {
  protected int a;

  protected Object b;

  // Mutant code added here
  private boolean getCondition() {
    return false; // This method returns false, but it is not a compile-time constant
  }

  public void someMethod() {
    // Randomly selected basic block to insert the mutant
    if (a > 0) {
      System.out.println("a is positive");
    }

    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never be printed because shouldRun is always false");
    } else {
      System.out.println("This will always be printed instead");
    }
  }
}