class ConfusingParenting {
  protected int a;

  protected Object b;

  // Inserting an unreachable for loop
  public void someMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}