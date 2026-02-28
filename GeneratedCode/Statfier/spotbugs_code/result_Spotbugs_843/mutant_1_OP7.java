class Issue527 {

  public void errorOnLambda() {
    Object o = getObject();
    if (o!= null) {
      useRunnable(() -> toString());
    }
    o.hashCode();
    Object o2 = getObject();
    if (o2!= null) {
      useRunnable(() -> toString());
    }
    o2.hashCode();

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }
  }

  public Object getObject() {
    return null;
  }

  public void useRunnable(Runnable listener) {}

  private boolean getCondition() {
    return false;
  }
}