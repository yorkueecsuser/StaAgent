class IgnoreBranchesWhereValueIsKnownNonNull {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    if (x!= null && b) return 0;

    // Introduced unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }

    return x.hashCode();
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}