class ConfusingParenting {
  protected int a;

  protected Object b;

  // Mutant code added below
  private boolean getCondition() {
    return false; // This method will always return false, making the if-else branch unreachable
  }

  public void someMethod() {
    // Example method to demonstrate insertion of mutant code
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute
      System.out.println("This is the unreachable if block");
    } else {
      // This block will always execute
      System.out.println("This is the else block");
    }
  }
}