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

    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      result -= 100; // This line will never be executed
    }

    return result;
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}