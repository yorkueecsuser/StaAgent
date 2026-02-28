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
    return result;
  }

  // Mutant code
  int g(Object y, boolean c) {
    int q = 0;
    if (y == null) {
      q++;
      q++;
      q++;
    }
    if (c) q += y.hashCode();
    if (c) q += y.hashCode();
    q += y.hashCode();
    return q;
  }
}