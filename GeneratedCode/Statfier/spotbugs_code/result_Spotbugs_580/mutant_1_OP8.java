class Ideas_2009_01_15 {

  public static int foo(Object x, Object y) {
    if (y == null) y = x;
    int h = x.hashCode();

    if (y!= null) h += y.hashCode();

    h += y.hashCode();
    return h;
  }

  // Mutant with renamed variable 'h' to 'a'
  public static int fooMutant1(Object x, Object y) {
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

  // Mutant with renamed variable 'x' to 'b'
  public static int fooMutant2(Object b) {

    if (b == null) System.out.println("null");

    return b.hashCode();
  }
}