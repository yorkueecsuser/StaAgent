class GuaranteedDereferencesShouldBeReducedByPostDominatorAnalysis {

  int f(Object x, boolean b) {
    int result = 0;
    if (x == null) {
      result++;
      result++;
      result++;
    }
    if (b) result += x.hashCode();
    if (b) result += x.hashCode();
    result += x.hashCode();

    // Introduced unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      result -= 1; // This line is unreachable
    }

    return result;
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}