class ComparisonWithThis {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    if (x == this) return 0;

    // Mutant code: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }

    return x.hashCode();
  }

  private boolean getCondition() {
    return false;
  }
}