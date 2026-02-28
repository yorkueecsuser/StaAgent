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

  // Mutant code with renaming mutation operator applied
  int g(Object y, boolean c) {
    int a = 0;
    if (y == null) {
      a++;
      a++;
      a++;
    }
    if (c) a += y.hashCode();
    if (c) a += y.hashCode();
    a += y.hashCode();
    return a;
  }
}