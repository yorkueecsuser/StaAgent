class Ideas_2009_01_15 {

  public static int foo(Object x, Object y) {
    if (y == null) y = x;
    int h = x.hashCode();
    int h_duplicate = x.hashCode(); // Duplicate assignment

    if (y!= null) h += y.hashCode();

    h += y.hashCode();
    h += y.hashCode(); // Duplicate assignment
    return h;
  }

  public static int foo(Object x) {

    if (x == null) System.out.println("null");

    int hash = x.hashCode();
    int hash_duplicate = x.hashCode(); // Duplicate assignment
    return x.hashCode();
  }
}