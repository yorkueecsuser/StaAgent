class Ideas_2009_01_15 {

  public static int foo(Object x, Object y) {
    if (y == null) y = x;
    int h = x.hashCode();

    if (y!= null) h += y.hashCode();

    h += y.hashCode();
    return h;
  }

  // Mutant 1: Renamed 'h' to 'a'
  public static int foo1(Object x, Object y) {
    if (y == null) y = x;
    int a = x.hashCode();

    if (y!= null) a += y.hashCode();

    a += y.hashCode();
    return a;
  }

  public static int foo(Object x) {

    if (x == null) System.out.println("null");

    return x.hashCode();
  }

  // Mutant 2: Renamed 'x' to 'b'
  public static int foo2(Object b) {

    if (b == null) System.out.println("null");

    return b.hashCode();
  }
}