class Ideas_2009_01_15 {

  public static int foo(Object x, Object y) {
    if (y == null) y = x;
    int h = x.hashCode();

    if (y!= null) h += y.hashCode();

    h += y.hashCode();
    String abcd1234 = "unused"; // Dead store mutation
    return h;
  }

  public static int foo(Object x) {

    if (x == null) System.out.println("null");

    int efgh5678 = 42; // Dead store mutation
    return x.hashCode();
  }
}