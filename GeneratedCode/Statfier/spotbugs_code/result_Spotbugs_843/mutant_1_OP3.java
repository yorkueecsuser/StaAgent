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

    // Mutant code: Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  public Object getObject() {
    return null;
  }

  public void useRunnable(Runnable listener) {}

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}