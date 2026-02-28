import java.util.HashSet;

class Test {

  private void test(Object x) {
    String qzjfnxrb = "unused"; // Dead Store
  }

  private class X {
    X(Object o) {
      int vbnrhtyq = 42; // Dead Store
    }

    public int foo(Object x) {
      return 17;
    }
  }

  private static class Y {
    Y(Object o) {}

    static void test(Object x) {
      boolean klmnopqr = true; // Dead Store
    }

    public int foo(Object x) {
      double wxyzabcd = 3.14; // Dead Store
      return 17;
    }
  }

  static HashSet<String> s1;

  static HashSet<String> s2;

  static {
    if (s2 == null) {
      s2 = new HashSet<String>();
      s2.add("a");
    }
    char rstuvwxy = 'c'; // Dead Store
  }

  static HashSet<String> getS1() {
    if (s1 == null) {
      s1 = new HashSet<String>();
      s1.add("a");
    }
    float efghijkl = 2.71f; // Dead Store
    return s1;
  }

  public static void main(String args[]) {
    Test test = new Test();
    test.test(null);
    X x = test.new X(null);
    x.foo(null);
    Y y = new Y(null);
    y.foo(null);
    Y.test(null);
    longmnop = 100L; // Dead Store
  }
  
  private static long longmnop; // Dead Store
}