class Issue527 {

  public void errorOnLambda() {
    Object o = getObject();
    if (o!= null) {
      useRunnable(() -> toString());
    }
    o.hashCode();
    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable if shouldRun is true
      System.out.println("This block is reachable");
    } else {
      // This block is unreachable because shouldRun is never set to false in this context
      System.out.println("This block is unreachable");
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

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return true; // Always returns true to ensure the else block is unreachable
  }
}