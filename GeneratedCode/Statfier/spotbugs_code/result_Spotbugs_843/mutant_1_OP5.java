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

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition? 0 : 1 will always be 1
        System.out.println("This is unreachable");
        break;
      case 1:
        // This is the only reachable case
        break;
    }
  }

  public Object getObject() {
    return null;
  }

  public void useRunnable(Runnable listener) {}

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}