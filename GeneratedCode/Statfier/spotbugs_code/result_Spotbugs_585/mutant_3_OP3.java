class InstanceOfInteraction {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    if (x instanceof String) return 0;

    // Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }

    return x.hashCode();
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}