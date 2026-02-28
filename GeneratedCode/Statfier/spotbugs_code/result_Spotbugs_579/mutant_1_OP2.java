class GuaranteedDereferencesShouldBeReducedByPostDominatorAnalysis {

  int f(Object x, boolean b) {
    int result = 0;
    if (x == null) {
      result++;
      result++; // Duplicated statement
      result++;
      result++; // Duplicated statement
    }
    if (b) result += x.hashCode();
    if (b) result += x.hashCode();
    result += x.hashCode();
    result += x.hashCode(); // Duplicated statement
    return result;
  }
}