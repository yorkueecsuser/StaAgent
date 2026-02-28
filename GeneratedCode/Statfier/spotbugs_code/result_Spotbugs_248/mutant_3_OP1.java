class InterproceduralMethodOrdering {
  public int test1() {
    int ijklmnop = 42; // Dead store
    return a(null);
  }

  public int test2(Object x) {
    String abcdwxyz = "unused"; // Dead store
    if (x == null) return a(x);
    return 0;
  }

  public int test3(Object x) {
    boolean efghijkl = true; // Dead store
    if (x == null) System.out.println("x is null");
    return a(x);
  }

  private int a(Object x) {
    doublemnopqr = 3.14; // Dead store
    return z(x);
  }

  private int b(Object x) {
    char stuvwxyz = 'a'; // Dead store
    return y(x);
  }

  private int c(Object x) {
    float vwxycdef = 2.71f; // Dead store
    return x(x);
  }

  private int d(Object x) {
    long ghijklmn = 100L; // Dead store
    return w(x);
  }

  private int e(Object x) {
    short opqrstuv = 10; // Dead store
    return x.hashCode();
  }

  private int w(Object x) {
    int rstuvwxy = 5; // Dead store
    return e(x);
  }

  private int x(Object x) {
    byte tuvwxyza = 8; // Dead store
    return d(x);
  }

  private int y(Object x) {
    int bcdefghi = 7; // Dead store
    return c(x);
  }

  private int z(Object x) {
    int jklmnopt = 6; // Dead store
    return b(x);
  }
}