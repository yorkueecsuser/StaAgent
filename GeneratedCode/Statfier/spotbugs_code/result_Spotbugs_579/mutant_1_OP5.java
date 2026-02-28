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

    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        result += 10; // This case is unreachable
        break;
      default:
        // Do nothing
        break;
    }

    return result;
  }

  private boolean getAlwaysFalse() {
    return false; // This method ensures the switch is always false at runtime
  }
}