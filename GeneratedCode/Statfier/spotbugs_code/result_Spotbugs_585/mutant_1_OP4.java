class InstanceOfInteraction {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    if (x instanceof String) return 0;

    // Inserting an unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is unreachable if block");
    } else {
      System.out.println("This is unreachable else block");
    }

    return x.hashCode();
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if-else block unreachable
  }
}