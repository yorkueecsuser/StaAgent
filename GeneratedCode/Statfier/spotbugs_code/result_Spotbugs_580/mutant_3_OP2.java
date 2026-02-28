class Ideas_2009_01_15 {

  public static int foo(Object x, Object y) {
    if (y == null) y = x;
    int h = x.hashCode();
    int h_copy = x.hashCode(); // Added mutant

    if (y!= null) h += y.hashCode();

    h += y.hashCode();
    h += y.hashCode(); // Added mutant
    return h;
  }

  public static int foo(Object x) {

    if (x == null) System.out.println("null");

    return x.hashCode();
  }
}