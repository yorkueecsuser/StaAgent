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

    // Mutant: Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
  }

  public Object getObject() {
    return null;
  }

  public void useRunnable(Runnable listener) {}

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}