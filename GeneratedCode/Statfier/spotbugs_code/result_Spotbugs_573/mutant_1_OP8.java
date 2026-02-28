class ComparisonWithThis {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    if (x == this) return 0;
    return x.hashCode();

    // Mutated code
    int y = 0; // Renamed 'x' to 'y'
    if (y == null) System.out.println("y is null");
    if (b) System.out.println("b is true");
    // at this point, Y is NCP
    if (y == this) return 1;
    return y.hashCode();
  }
}