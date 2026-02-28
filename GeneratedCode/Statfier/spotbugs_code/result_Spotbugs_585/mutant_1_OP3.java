class InstanceOfInteraction {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    if (x instanceof String) return 0;

    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }

    return x.hashCode();
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}