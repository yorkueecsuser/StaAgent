class ComparisonWithThis {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
    if (x == this) return 0;
    return x.hashCode();
  }

  private boolean getCondition() {
    return false;
  }
}