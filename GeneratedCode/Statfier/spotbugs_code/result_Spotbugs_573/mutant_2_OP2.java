class ComparisonWithThis {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (x == null) System.out.println("x is null"); // Duplicate condition check
    if (b) System.out.println("b is true");
    if (b) System.out.println("b is true"); // Duplicate condition check
    // at this point, X is NCP
    if (x == this) return 0;
    if (x == this) return 0; // Duplicate condition check
    return x.hashCode();
  }
}