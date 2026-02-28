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

    // Mutant: Inserting an unreachable if-else branch
    boolean shouldRun = false; // This variable ensures the branch is unreachable but not due to a compile-time constant
    if (shouldRun) {
      result += 10; // Some arbitrary operation to demonstrate the mutant
    } else {
      result += 20; // Another arbitrary operation
    }

    return result;
  }
}