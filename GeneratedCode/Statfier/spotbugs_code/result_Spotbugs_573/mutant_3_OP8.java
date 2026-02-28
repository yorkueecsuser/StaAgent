class ComparisonWithThis {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    if (x == this) return 0;
    return x.hashCode();

    // Mutated code
    Object y = x; // Renamed 'x' to 'y'
    boolean c = b; // Renamed 'b' to 'c'
    if (y == null) System.out.println("y is null");
    if (c) System.out.println("c is true");
    // at this point, Y is NCP
    if (y == this) return 1;
    return y.hashCode();
  }
}