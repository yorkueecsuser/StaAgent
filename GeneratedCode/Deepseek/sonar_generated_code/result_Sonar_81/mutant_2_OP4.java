class MyClass {
  private boolean condition = true;
  private boolean conditionWhile = true;
  private boolean conditionFor = true;
  private boolean shouldRun = true;
  private int value = 1;

  public void doSomethingSynchronized() {
    synchronized (this.getClass()) {  // Noncompliant
      //...
    }
    while (this.getClass().getName().equals("MyClass") && conditionWhile) {  // Mutated
      //...
    }
  }

  public void showBug() {
    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      //...
    }
    if (condition) {  // Mutated
      //...
    }
  }

  public boolean getCondition() {
    return condition;
  }

  public boolean getConditionWhile() {
    return conditionWhile;
  }

  public boolean getConditionFor() {
    return conditionFor;
  }

  public boolean getShouldRun() {
    return shouldRun;
  }

  public int getValue() {
    return value;
  }
}