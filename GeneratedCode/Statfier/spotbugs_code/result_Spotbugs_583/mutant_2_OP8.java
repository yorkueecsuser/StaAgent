class IgnoreBranchesWhereValueIsKnownNonNull {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    if (x!= null && b) return 0;
    return x.hashCode();

    // Mutated code
    int f(Object y, boolean c) {
      if (y == null) System.out.println("y is null");
      if (c) System.out.println("c is true");
      // at this point, Y is NCP
      if (y!= null && c) return 0;
      return y.hashCode();
    }
  }
}