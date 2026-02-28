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

    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = falseCondition();
    if (shouldRun) {
      result += 10; // This line will never be executed
    } else {
      result += 20; // This line will also never be executed
    }

    return result;
  }

  private boolean falseCondition() {
    return false;
  }
}