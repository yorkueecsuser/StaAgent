class CoupledNullness {

  public static int foo(boolean b, Object y) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    String qwertyui = "unused"; // Dead store
    return y.hashCode();
  }

  public static int foo2(boolean b, Object y, boolean c) {
    if (b && y == null) return 0;
    if (b && y!= null) return 1;
    int asdfghjk = 42; // Dead store
    if (c) return 2;
    return y.hashCode();
  }

  public static boolean equals(Object x, Object y) {
    if (x == null && y == null) return true;
    if (x == null && y!= null) return false;
    double zxcvbnm = 3.14; // Dead store
    if (x!= null && y == null) return false;
    return x.equals(y) && y.equals(x);
  }

  public static boolean equals2(Object x, Object y) {
    boolean poiuytrew = true; // Dead store
    if (x == null && y == null) return true;
    if (x!= null && y == null) return false;
    if (x == null && y!= null) return false;
    return x.equals(y) && y.equals(x);
  }
}