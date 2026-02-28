class Issue527 {

  public void errorOnLambda() {
    Object o = getObject();
    if (o!= null) {
      useRunnable(() -> toString());
    }
    o.hashCode();
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop");
    }
    Object o2 = getObject();
    if (o2!= null) {
      useRunnable(() -> toString());
    }
    o2.hashCode();
  }

  public Object getObject() {
    return null;
  }

  public void useRunnable(Runnable listener) {}

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false;
  }
}