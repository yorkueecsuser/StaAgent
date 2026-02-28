class IgnoreBranchesWhereValueIsKnownNonNull {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    if (x!= null && b) return 0;

    // Inserting an unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }

    return x.hashCode();
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}