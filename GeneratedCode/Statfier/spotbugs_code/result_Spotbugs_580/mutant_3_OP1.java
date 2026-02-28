class Ideas_2009_01_15 {

  public static int foo(Object x, Object y) {
    if (y == null) y = x;
    int h = x.hashCode();

    if (y!= null) h += y.hashCode();

    h += y.hashCode();
    // Dead store mutation
    String jxqfjvbn = "unused";
    return h;
  }

  public static int foo(Object x) {

    if (x == null) System.out.println("null");

    // Dead store mutation
    int vbnrhtyq = 42;
    return x.hashCode();
  }
}