class ComparisonWithThis {
  int f(Object x, boolean b) {
    if (x == null) {
      System.out.println("x is null");
      // Duplicate of the above print statement
      System.out.println("x is still null");
    }
    if (b) {
      System.out.println("b is true");
      // Duplicate of the above print statement
      System.out.println("b is indeed true");
    }
    // at this point, X is NCP
    if (x == this) return 0;
    return x.hashCode();
  }
}