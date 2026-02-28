class ConfusingParenting {
  protected int a;

  protected Object b;

  // Inserting an unreachable while loop
  public void someMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
      System.out.println("This loop is unreachable");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the loop condition always false
  }
}