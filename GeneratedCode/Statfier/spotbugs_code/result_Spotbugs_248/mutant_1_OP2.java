class InterproceduralMethodOrdering {
  public int test1() {
    return a(null);
    // Mutant: Duplicate the return statement
    return a(null);
  }

  public int test2(Object x) {
    if (x == null) return a(x);
    // Mutant: Duplicate the return statement
    return a(x);
    return 0;
  }

  public int test3(Object x) {
    if (x == null) System.out.println("x is null");
    return a(x);
    // Mutant: Duplicate the return statement
    return a(x);
  }

  private int a(Object x) {
    return z(x);
    // Mutant: Duplicate the return statement
    return z(x);
  }

  private int b(Object x) {
    return y(x);
    // Mutant: Duplicate the return statement
    return y(x);
  }

  private int c(Object x) {
    return x(x);
    // Mutant: Duplicate the return statement
    return x(x);
  }

  private int d(Object x) {
    return w(x);
    // Mutant: Duplicate the return statement
    return w(x);
  }

  private int e(Object x) {
    return x.hashCode();
    // Mutant: Duplicate the return statement
    return x.hashCode();
  }

  private int w(Object x) {
    return e(x);
    // Mutant: Duplicate the return statement
    return e(x);
  }

  private int x(Object x) {
    return d(x);
    // Mutant: Duplicate the return statement
    return d(x);
  }

  private int y(Object x) {
    return c(x);
    // Mutant: Duplicate the return statement
    return c(x);
  }

  private int z(Object x) {
    return b(x);
    // Mutant: Duplicate the return statement
    return b(x);
  }
}