class ComparisonWithThis {
  int f(Object x, boolean b) {
    if (x == null) System.out.println("x is null");
    if (b) System.out.println("b is true");
    // at this point, X is NCP
    if (x == this) return 0;
    int temp = x.hashCode(); // Original statement
    int temp2 = x.hashCode(); // Mutated statement (duplicated)
    return temp;
  }
}