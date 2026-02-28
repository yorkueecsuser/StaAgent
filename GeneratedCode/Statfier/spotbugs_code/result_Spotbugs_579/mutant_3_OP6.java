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

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is never set to true
    }

    return result;
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the loop is unreachable
    return false;
  }
}