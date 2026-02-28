class InterproceduralMethodOrdering {
  public int test1() {
    return a(null);
  }

  public int test2(Object x) {
    if (x == null) return a(x);
    return 0;
  }

  public int test3(Object x) {
    if (x == null) System.out.println("x is null");
    return a(x);
  }

  private int a(Object x) {
    return z(x);
  }

  private int b(Object x) {
    return y(x);
  }

  private int c(Object x) {
    return x(x);
  }

  private int d(Object x) {
    return w(x);
  }

  private int e(Object x) {
    return x.hashCode();
  }

  private int w(Object x) {
    return e(x);
  }

  private int x(Object x) {
    return d(x);
  }

  private int y(Object x) {
    return c(x);
  }

  private int z(Object x) {
    return b(x);
  }

  // Mutants
  public int test1Mutant() {
    return a(q);
  }

  public int test2Mutant(Object v) {
    if (v == null) return a(v);
    return 0;
  }

  public int test3Mutant(Object r) {
    if (r == null) System.out.println("r is null");
    return a(r);
  }

  private int aMutant(Object p) {
    return z(p);
  }

  private int bMutant(Object o) {
    return y(o);
  }

  private int cMutant(Object n) {
    return x(n);
  }

  private int dMutant(Object m) {
    return w(m);
  }

  private int eMutant(Object l) {
    return l.hashCode();
  }

  private int wMutant(Object k) {
    return e(k);
  }

  private int xMutant(Object j) {
    return d(j);
  }

  private int yMutant(Object i) {
    return c(i);
  }

  private int zMutant(Object h) {
    return b(h);
  }
}