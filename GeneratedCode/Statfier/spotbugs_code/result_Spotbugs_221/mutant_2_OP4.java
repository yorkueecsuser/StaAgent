class ConfusingParenting {
  protected int a;

  protected Object b;

  // Mutant code added here
  private boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code
      a = 10;
    } else {
      // Alternative code
      b = new Object();
    }
  }
}