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
  public int test1m() {
    return a(m(null));
  }

  public int test2m(Object m) {
    if (m == null) return a(m);
    return 0;
  }

  public int test3m(Object n) {
    if (n == null) System.out.println("n is null");
    return a(n);
  }

  private int am(Object p) {
    return zm(p);
  }

  private int bm(Object q) {
    return ym(q);
  }

  private int cm(Object r) {
    return xm(r);
  }

  private int dm(Object s) {
    return wm(s);
  }

  private int em(Object t) {
    return t.hashCode();
  }

  private int wm(Object u) {
    return em(u);
  }

  private int xm(Object v) {
    return dm(v);
  }

  private int ym(Object w) {
    return cm(w);
  }

  private int zm(Object x) {
    return bm(x);
  }
}