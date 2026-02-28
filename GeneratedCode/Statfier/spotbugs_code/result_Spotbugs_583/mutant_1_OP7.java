class IgnoreBranchesWhereValueIsKnownNonNull {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    if (x!= null && b) return 0;

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
      System.out.println("This loop is unreachable");
    }

    return x.hashCode();
  }

  private boolean getCondition() {
    return false;
  }
}