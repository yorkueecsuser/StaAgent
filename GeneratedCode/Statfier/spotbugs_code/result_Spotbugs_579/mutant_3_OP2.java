class GuaranteedDereferencesShouldBeReducedByPostDominatorAnalysis {

  int f(Object x, boolean b) {
    int result = 0;
    if (x == null) {
      result++;
      result++; // Duplicate of result++
      result++;
      result++; // Duplicate of result++
    }
    if (b) result += x.hashCode();
    if (b) result += x.hashCode();
    result += x.hashCode();
    result += x.hashCode(); // Duplicate of result += x.hashCode()
    return result;
  }
}