class ConfusingParenting {
  protected int a;

  protected Object b;

  // Mutant code added here
  private boolean getUnreachableCondition() {
    return false;
  }

  public void someMethod() {
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      a = 10;
      b = new Object();
    }
  }
}