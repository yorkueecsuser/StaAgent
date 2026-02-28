class InstanceOfInteraction {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is always false
    }
    if (x instanceof String) return 0;
    return x.hashCode();
  }

  private boolean getConditionForLoop() {
    return false; // This method returns false, making the loop condition always false
  }
}