class CoupledNullness {

  public static int foo(boolean b, Object y) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    return y.hashCode();
  }

  // Mutant of foo with renamed variable
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

  // Mutant of foo2 with renamed variable
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

  // Mutant of equals with renamed variable
  public static boolean equalsa(Object p, Object q) {
    if (p == null && q == null) return true;
    if (p == null && q!= null) return false;
    if (p!= null && q == null) return false;
    return p.equals(q) && q.equals(p);
  }

  public static boolean equals2(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x!= null && y == null) return false;
    if (x == null && y!= null) return false;
    return x.equals(y) && y.equals(x);
  }

  // Mutant of equals2 with renamed variable
  public static boolean equals2a(Object p, Object q) {
    if (p == null && q == null) return true;
    if (p!= null && q == null) return false;
    if (p == null && q!= null) return false;
    return p.equals(q) && q.equals(p);
  }
}