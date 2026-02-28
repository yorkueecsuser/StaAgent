class CoupledNullness {

  public static int foo(boolean b, Object y) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    return y.hashCode();
  }

  // Mutant for foo method
  public static int fooa(boolean a, Object z) {
    if (a && z == null) return 0;
    if (a && z!= null) return 1;
    return z.hashCode();
  }

  public static int foo2(boolean b, Object y, boolean c) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    if (c) return 2;
    return y.hashCode();
  }

  // Mutant for foo2 method
  public static int foo2a(boolean a, Object z, boolean d) {
    if (a && z == null) return 0;
    if (a && z!= null) return 1;
    if (d) return 2;
    return z.hashCode();
  }

  public static boolean equals(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x == null && y!= null) return false;
    if (x!= null && y == null) return false;
    return x.equals(y) && y.equals(x);
  }

  // Mutant for equals method
  public static boolean equalsa(Object w, Object v) {
    if (w == null && v == null) return true;
    if (w == null && v!= null) return false;
    if (w!= null && v == null) return false;
    return w.equals(v) && v.equals(w);
  }

  public static boolean equals2(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x!= null && y == null) return false;
    if (x == null && y!= null) return false;
    return x.equals(y) && y.equals(x);
  }

  // Mutant for equals2 method
  public static boolean equals2a(Object w, Object v) {
    if (w == null && v == null) return true;
    if (w!= null && v == null) return false;
    if (w == null && v!= null) return false;
    return w.equals(v) && v.equals(w);
  }
}