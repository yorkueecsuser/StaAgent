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

    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        result += 100; // This will never be executed
        break;
      case false:
        result += 200; // This will also never be executed
        break;
    }

    return result;
  }

  private boolean getAlwaysFalse() {
    return false; // This method always returns false, making the switch statement unreachable
  }
}