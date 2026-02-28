class CoupledNullness {

  public static int foo(boolean b, Object y) {
    int qwerasdf; // Dead store
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    return y.hashCode();
  }

  public static int foo2(boolean b, Object y, boolean c) {
    String zxcvbnml; // Dead store
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    if (c) return 2;
    return y.hashCode();
  }

  public static boolean equals(Object x, Object y) {
    double poiuytrew; // Dead store
    if (x == null && y == null) return true;
    if (x == null && y!= null) return false;
    if (x!= null && y == null) return false;
    return x.equals(y) && y.equals(x);
  }

  public static boolean equals2(Object x, Object y) {
    char lkjhgfdsa; // Dead store
    if (x == null && y == null) return true;
    if (x!= null && y == null) return false;
    if (x == null && y!= null) return false;
    return x.equals(y) && y.equals(x);
  }
}