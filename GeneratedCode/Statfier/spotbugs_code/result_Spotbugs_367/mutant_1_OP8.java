class CoupledNullness {

  public static int foo(boolean b, Object y) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    return y.hashCode();
  }

  // Mutant for foo method
  public static int fooa(boolean b, Object a) {
    if (b && a == null) return 0;
    if (b && a!= null) return 1;
    return a.hashCode();
  }

  public static int foo2(boolean b, Object y, boolean c) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    if (c) return 2;
    return y.hashCode();
  }

  // Mutant for foo2 method
  public static int foo2a(boolean d, Object e, boolean f) {
    if (d && e == null) return 0;
    if (d && e!= null) return 1;
    if (f) return 2;
    return e.hashCode();
  }

  public static boolean equals(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x == null && y!= null) return false;
    if (x!= null && y == null) return false;
    return x.equals(y) && y.equals(x);
  }

  // Mutant for equals method
  public static boolean equalsa(Object g, Object h) {
    if (g == null && h == null) return true;
    if (g == null && h!= null) return false;
    if (g!= null && h == null) return false;
    return g.equals(h) && h.equals(g);
  }

  public static boolean equals2(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x!= null && y == null) return false;
    if (x == null && y!= null) return false;
    return x.equals(y) && y.equals(x);
  }

  // Mutant for equals2 method
  public static boolean equals2a(Object i, Object j) {
    if (i == null && j == null) return true;
    if (i!= null && j == null) return false;
    if (i == null && j!= null) return false;
    return i.equals(j) && j.equals(i);
  }
}