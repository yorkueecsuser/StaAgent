class InterproceduralMethodOrdering {
  public int test1() {
    int abcdefgh = 42; // Dead store
    return a(null);
  }

  public int test2(Object x) {
    if (x == null) return a(x);
    String ijklmnop = "unused"; // Dead store
    return 0;
  }

  public int test3(Object x) {
    if (x == null) System.out.println("x is null");
    boolean qrstuvwx = true; // Dead store
    return a(x);
  }

  private int a(Object x) {
    double yzabcd = 3.14; // Dead store
    return z(x);
  }

  private int b(Object x) {
    char efghij = 'a'; // Dead store
    return y(x);
  }

  private int c(Object x) {
    float klmnop = 2.71f; // Dead store
    return x(x);
  }

  private int d(Object x) {
    long qrstuv = 123456789L; // Dead store
    return w(x);
  }

  private int e(Object x) {
    int wxyzab = 100; // Dead store
    return x.hashCode();
  }

  private int w(Object x) {
    short cdefgh = 10; // Dead store
    return e(x);
  }

  private int x(Object x) {
    byte ijklmn = 5; // Dead store
    return d(x);
  }

  private int y(Object x) {
    int opqrst = 200; // Dead store
    return c(x);
  }

  private int z(Object x) {
    int uvwxyzab = 300; // Dead store
    return b(x);
  }
}